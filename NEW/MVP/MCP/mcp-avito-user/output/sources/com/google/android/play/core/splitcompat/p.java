package com.google.android.play.core.splitcompat;

import android.os.Build;
import j.X;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f358676b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a, reason: collision with root package name */
    public final g f358677a;

    public p(g gVar) {
        this.f358677a = gVar;
    }

    @X
    public static void b(v vVar, m mVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(vVar.a());
        } catch (IOException e12) {
            e = e12;
            zipFile = null;
        }
        try {
            HashMap map = new HashMap();
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = f358676b.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    Set hashSet = (Set) map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new o(zipEntryNextElement, strGroup2));
                }
            }
            HashMap map2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (map.containsKey(str)) {
                    for (o oVar : (Set) map.get(str)) {
                        boolean zContainsKey = map2.containsKey(oVar.f358674a);
                        String str2 = oVar.f358674a;
                        if (!zContainsKey) {
                            map2.put(str2, oVar);
                        }
                    }
                }
            }
            mVar.a(zipFile, new HashSet(map2.values()));
            zipFile.close();
        } catch (IOException e13) {
            e = e13;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e14) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e14);
                }
            }
            throw e;
        }
    }

    @X
    public final HashSet a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        g gVar = this.f358677a;
        HashSet hashSetA = gVar.a();
        ArrayList arrayList = new ArrayList();
        File file = new File(gVar.g(), "native-libraries");
        g.e(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = hashSetA.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    File file3 = new File(gVar.g(), "native-libraries");
                    g.e(file3);
                    File fileD = g.d(file3, str);
                    g.e(fileD);
                    g.c(fileD);
                    break;
                }
                if (((v) it2.next()).b().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = hashSetA.iterator();
        while (it3.hasNext()) {
            v vVar = (v) it3.next();
            HashSet hashSet2 = new HashSet();
            b(vVar, new k(this, hashSet2, vVar));
            String strB = vVar.b();
            HashSet hashSet3 = new HashSet();
            File file4 = new File(gVar.g(), "native-libraries");
            g.e(file4);
            File fileD2 = g.d(file4, strB);
            g.e(fileD2);
            File[] fileArrListFiles2 = fileD2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    file6.getAbsolutePath();
                    vVar.a().getAbsolutePath();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(gVar.g(), "native-libraries");
                    g.e(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    g.c(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(v vVar, HashSet hashSet, n nVar) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            String strB = vVar.b();
            String str = oVar.f358674a;
            g gVar = this.f358677a;
            gVar.getClass();
            File file = new File(gVar.g(), "native-libraries");
            g.e(file);
            File fileD = g.d(file, strB);
            g.e(fileD);
            File fileD2 = g.d(fileD, str);
            boolean z12 = false;
            if (fileD2.exists() && fileD2.length() == oVar.f358675b.getSize() && !fileD2.canWrite()) {
                z12 = true;
            }
            nVar.a(oVar, fileD2, z12);
        }
    }
}
