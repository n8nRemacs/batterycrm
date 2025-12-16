package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import okio.M;

/* compiled from: ContentStreamRequestHandler.java */
/* renamed from: com.squareup.picasso.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37871h extends C {

    /* renamed from: a, reason: collision with root package name */
    public final Context f366433a;

    public C37871h(Context context) {
        this.f366433a = context;
    }

    @Override // com.squareup.picasso.C
    public boolean b(A a12) {
        return "content".equals(a12.f366289a.getScheme());
    }

    @Override // com.squareup.picasso.C
    public C.a e(A a12, int i12) {
        return new C.a(M.g(this.f366433a.getContentResolver().openInputStream(a12.f366289a)), Picasso.LoadedFrom.DISK);
    }
}
