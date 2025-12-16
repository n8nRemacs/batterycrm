package com.vk.id.internal.auth.web;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;

/* compiled from: DelimitedVersion.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vk/id/internal/auth/web/DelimitedVersion;", "", "mNumericParts", "", "<init>", "([J)V", "toString", "", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "compareTo", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DelimitedVersion implements Comparable<DelimitedVersion> {

    @k
    private final long[] mNumericParts;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DelimitedVersion.kt */
    @s0
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/vk/id/internal/auth/web/DelimitedVersion$Companion;", "", "<init>", "()V", "PRIME_HASH_FACTOR", "", "BIT_MASK_32", "", "parse", "Lcom/vk/id/internal/auth/web/DelimitedVersion;", "versionString", "", "compareLongs", "a", "b", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int compareLongs(long a12, long b12) {
            if (a12 < b12) {
                return -1;
            }
            return a12 > b12 ? 1 : 0;
        }

        @n
        @k
        public final DelimitedVersion parse(@l String versionString) {
            Collection collectionE0;
            if (versionString == null) {
                return new DelimitedVersion(new long[0]);
            }
            List listH = new C43059p("[^0-9]+").h(versionString);
            if (listH.isEmpty()) {
                collectionE0 = C42784z0.f406748b;
            } else {
                ListIterator listIterator = listH.listIterator(listH.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionE0 = C42745f0.E0(listH, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                collectionE0 = C42784z0.f406748b;
            }
            String[] strArr = (String[]) collectionE0.toArray(new String[0]);
            long[] jArr = new long[strArr.length];
            int i12 = 0;
            for (String str : strArr) {
                if (str.length() != 0) {
                    jArr[i12] = Long.parseLong(str);
                    i12++;
                }
            }
            do {
                i12--;
                if (i12 < 0) {
                    break;
                }
            } while (jArr[i12] <= 0);
            int i13 = i12 + 1;
            long[] jArr2 = new long[i13];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            return new DelimitedVersion(jArr2);
        }

        private Companion() {
        }
    }

    public DelimitedVersion(@k long[] jArr) {
        this.mNumericParts = jArr;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return other != null && (other instanceof DelimitedVersion) && compareTo((DelimitedVersion) other) == 0;
    }

    public int hashCode() {
        int i12 = 0;
        for (long j12 : this.mNumericParts) {
            i12 = (i12 * 92821) + ((int) j12);
        }
        return i12;
    }

    @k
    public String toString() {
        if (this.mNumericParts.length == 0) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mNumericParts[0]);
        for (int i12 = 1; i12 < this.mNumericParts.length; i12++) {
            sb2.append('.');
            sb2.append(this.mNumericParts[i12]);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return com.vk.id.internal.auth.web.DelimitedVersion.INSTANCE.compareLongs(r1.length, r7.mNumericParts.length);
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(@Y61.k com.vk.id.internal.auth.web.DelimitedVersion r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            long[] r1 = r6.mNumericParts
            int r2 = r1.length
            if (r0 >= r2) goto L1b
            long[] r2 = r7.mNumericParts
            int r3 = r2.length
            if (r0 >= r3) goto L1b
            com.vk.id.internal.auth.web.DelimitedVersion$Companion r3 = com.vk.id.internal.auth.web.DelimitedVersion.INSTANCE
            r4 = r1[r0]
            r1 = r2[r0]
            int r1 = com.vk.id.internal.auth.web.DelimitedVersion.Companion.access$compareLongs(r3, r4, r1)
            if (r1 == 0) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            com.vk.id.internal.auth.web.DelimitedVersion$Companion r0 = com.vk.id.internal.auth.web.DelimitedVersion.INSTANCE
            int r1 = r1.length
            long r1 = (long) r1
            long[] r7 = r7.mNumericParts
            int r7 = r7.length
            long r3 = (long) r7
            int r7 = com.vk.id.internal.auth.web.DelimitedVersion.Companion.access$compareLongs(r0, r1, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.internal.auth.web.DelimitedVersion.compareTo(com.vk.id.internal.auth.web.DelimitedVersion):int");
    }
}
