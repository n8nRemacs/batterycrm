package com.squareup.picasso;

import android.net.Uri;

/* compiled from: MediaStoreRequestHandler.java */
/* loaded from: classes7.dex */
class t extends C37871h {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f366460b = {"orientation"};

    /* compiled from: MediaStoreRequestHandler.java */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);


        /* renamed from: b, reason: collision with root package name */
        public final int f366465b;

        /* renamed from: c, reason: collision with root package name */
        public final int f366466c;

        /* renamed from: d, reason: collision with root package name */
        public final int f366467d;

        a(int i12, int i13, int i14) {
            this.f366465b = i12;
            this.f366466c = i13;
            this.f366467d = i14;
        }
    }

    @Override // com.squareup.picasso.C37871h, com.squareup.picasso.C
    public final boolean b(A a12) {
        Uri uri = a12.f366289a;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[PHI: r1
  0x002f: PHI (r1v18 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v20 android.database.Cursor) binds: [B:21:0x003e, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    @Override // com.squareup.picasso.C37871h, com.squareup.picasso.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.squareup.picasso.C.a e(com.squareup.picasso.A r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.t.e(com.squareup.picasso.A, int):com.squareup.picasso.C$a");
    }
}
