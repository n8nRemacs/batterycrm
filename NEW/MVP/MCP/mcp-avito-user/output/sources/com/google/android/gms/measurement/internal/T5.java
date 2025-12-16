package com.google.android.gms.measurement.internal;

import androidx.collection.C20199a;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class T5 extends AbstractC36990v5 {

    /* renamed from: d, reason: collision with root package name */
    public String f354921d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f354922e;

    /* renamed from: f, reason: collision with root package name */
    public C20199a f354923f;

    /* renamed from: g, reason: collision with root package name */
    public Long f354924g;

    /* renamed from: h, reason: collision with root package name */
    public Long f354925h;

    @Override // com.google.android.gms.measurement.internal.AbstractC36990v5
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V5 l(Integer num) {
        if (this.f354923f.containsKey(num)) {
            return (V5) this.f354923f.get(num);
        }
        V5 v52 = new V5(this, this.f354921d, null);
        this.f354923f.put(num, v52);
        return v52;
    }

    /* JADX WARN: Code restructure failed: missing block: B:371:0x0981, code lost:
    
        r0 = zzj();
        r7 = com.google.android.gms.measurement.internal.S1.i(r64.f354921d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x098f, code lost:
    
        if (r9.zzi() == false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0991, code lost:
    
        r8 = java.lang.Integer.valueOf(r9.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x099a, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x099b, code lost:
    
        r0.f354892i.a(r7, "Invalid property filter ID. appId, id", java.lang.String.valueOf(r8));
        r13 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab A[Catch: all -> 0x01b9, SQLiteException -> 0x01bd, TRY_LEAVE, TryCatch #8 {all -> 0x01b9, blocks: (B:67:0x01a5, B:69:0x01ab, B:76:0x01c4, B:77:0x01c9, B:78:0x01d3, B:79:0x01e5, B:86:0x020d, B:81:0x01f4, B:83:0x0200, B:85:0x0206, B:98:0x022e), top: B:410:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4 A[Catch: all -> 0x01b9, SQLiteException -> 0x01bd, TRY_ENTER, TryCatch #8 {all -> 0x01b9, blocks: (B:67:0x01a5, B:69:0x01ab, B:76:0x01c4, B:77:0x01c9, B:78:0x01d3, B:79:0x01e5, B:86:0x020d, B:81:0x01f4, B:83:0x0200, B:85:0x0206, B:98:0x022e), top: B:410:0x01a5 }] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v31, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.T5.m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.ArrayList");
    }
}
