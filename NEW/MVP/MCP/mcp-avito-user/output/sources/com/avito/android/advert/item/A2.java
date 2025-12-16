package com.avito.android.advert.item;

import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: VerticalInfo.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class A2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2.equals("114") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r2.equals("113") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r2.equals("26") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r2.equals("25") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r2.equals("24") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r2.equals("23") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r2.equals("86") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r2.equals("85") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        if (r2.equals("42") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        return com.avito.android.advert.item.z2.f80771b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return com.avito.android.advert.item.z2.f80772c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.advert.item.z2 a(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            r1 = 1662(0x67e, float:2.329E-42)
            if (r0 == r1) goto L62
            r1 = 1789(0x6fd, float:2.507E-42)
            if (r0 == r1) goto L59
            r1 = 1790(0x6fe, float:2.508E-42)
            if (r0 == r1) goto L50
            switch(r0) {
                case 1601: goto L47;
                case 1602: goto L3e;
                case 1603: goto L35;
                case 1604: goto L2c;
                default: goto L13;
            }
        L13:
            switch(r0) {
                case 48659: goto L20;
                case 48660: goto L17;
                default: goto L16;
            }
        L16:
            goto L6a
        L17:
            java.lang.String r0 = "114"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L29
            goto L6a
        L20:
            java.lang.String r0 = "113"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L29
            goto L6a
        L29:
            com.avito.android.advert.item.z2 r2 = com.avito.android.advert.item.z2.f80772c
            goto L6f
        L2c:
            java.lang.String r0 = "26"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto L6a
        L35:
            java.lang.String r0 = "25"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto L6a
        L3e:
            java.lang.String r0 = "24"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto L6a
        L47:
            java.lang.String r0 = "23"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto L6a
        L50:
            java.lang.String r0 = "86"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L6a
            goto L6d
        L59:
            java.lang.String r0 = "85"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto L6a
        L62:
            java.lang.String r0 = "42"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
        L6a:
            com.avito.android.advert.item.z2 r2 = com.avito.android.advert.item.z2.f80773d
            goto L6f
        L6d:
            com.avito.android.advert.item.z2 r2 = com.avito.android.advert.item.z2.f80771b
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.A2.a(java.lang.String):com.avito.android.advert.item.z2");
    }

    public static final boolean b(@Y61.l AdvertDetails advertDetails) {
        String categoryId;
        return ((advertDetails == null || (categoryId = advertDetails.getCategoryId()) == null) ? null : a(categoryId)) == z2.f80771b;
    }

    public static final boolean c(@Y61.l AdvertDetails advertDetails) {
        String categoryId;
        return ((advertDetails == null || (categoryId = advertDetails.getCategoryId()) == null) ? null : a(categoryId)) == z2.f80772c;
    }
}
