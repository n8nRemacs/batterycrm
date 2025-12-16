package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.AbstractC37143m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class U extends AbstractC37143m {

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f358239b = new TreeMap();

    public U(File file, File file2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayListA = D1.a(file, file2);
        if (arrayListA.isEmpty()) {
            throw new C37184v0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        Iterator it = arrayListA.iterator();
        long length = 0;
        while (it.hasNext()) {
            File file3 = (File) it.next();
            this.f358239b.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC37143m
    public final long a() {
        Map.Entry entryLastEntry = this.f358239b.lastEntry();
        return ((File) entryLastEntry.getValue()).length() + ((Long) entryLastEntry.getKey()).longValue();
    }

    @Override // com.google.android.play.core.assetpacks.internal.AbstractC37143m
    public final InputStream b(long j12, long j13) {
        if (j12 < 0 || j13 < 0) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "Invalid input parameters ", ", ");
            sbQ.append(j13);
            throw new C37184v0(sbQ.toString());
        }
        long j14 = j12 + j13;
        if (j14 > a()) {
            StringBuilder sbQ2 = androidx.compose.foundation.H.q(a(), "Trying to access archive out of bounds. Archive ends at: ", ". Tried accessing: ");
            sbQ2.append(j14);
            throw new C37184v0(sbQ2.toString());
        }
        TreeMap treeMap = this.f358239b;
        Long l12 = (Long) treeMap.floorKey(Long.valueOf(j12));
        Long l13 = (Long) treeMap.floorKey(Long.valueOf(j14));
        if (l12.equals(l13)) {
            return new T(c(j12, l12), j13);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c(j12, l12));
        Collection collectionValues = treeMap.subMap(l12, false, l13, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new C37115d1(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new T(new FileInputStream((File) treeMap.get(l13)), j13 - (l13.longValue() - j12)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    public final FileInputStream c(long j12, Long l12) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f358239b.get(l12));
        if (fileInputStream.skip(j12 - l12.longValue()) == j12 - l12.longValue()) {
            return fileInputStream;
        }
        throw new C37184v0("Virtualized slice archive corrupt, could not skip in file with key " + l12);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
