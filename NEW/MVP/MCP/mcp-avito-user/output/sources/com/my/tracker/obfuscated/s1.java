package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* loaded from: classes7.dex */
public class s1 implements y1 {

    /* renamed from: d, reason: collision with root package name */
    final f2 f365795d;

    /* renamed from: e, reason: collision with root package name */
    final C37849x f365796e;

    /* renamed from: g, reason: collision with root package name */
    final Context f365798g;

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f365792a = new ByteArrayOutputStream(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);

    /* renamed from: b, reason: collision with root package name */
    ByteArrayOutputStream f365793b = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: c, reason: collision with root package name */
    final ByteArrayOutputStream f365794c = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);

    /* renamed from: f, reason: collision with root package name */
    final List<PackageInfo> f365797f = new ArrayList();

    public s1(f2 f2Var, Context context) {
        this.f365795d = f2Var;
        this.f365796e = C37849x.a(f2Var);
        this.f365798g = context.getApplicationContext();
    }

    @Override // com.my.tracker.obfuscated.y1
    public byte[] a(w1 w1Var) {
        this.f365792a.reset();
        this.f365793b.reset();
        r1 r1Var = new r1(this.f365792a, this.f365793b);
        r1Var.w(w1Var.c());
        r1Var.e(w1Var.d());
        r1Var.a(w1Var.a());
        r1Var.a(w1Var.e());
        r1Var.a(w1Var.b());
        boolean zP2 = this.f365795d.p();
        boolean zR2 = this.f365795d.r();
        synchronized (this.f365796e) {
            this.f365796e.a(this.f365797f, zP2, zR2);
            this.f365796e.a(this.f365798g);
            this.f365796e.a(r1Var, this.f365798g);
        }
        this.f365795d.a(r1Var);
        this.f365794c.reset();
        r1Var.a(this.f365794c);
        byte[] byteArray = this.f365794c.toByteArray();
        if (this.f365792a.size() > 65536) {
            this.f365792a = new ByteArrayOutputStream(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        }
        if (this.f365793b.size() > 16384) {
            this.f365793b = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        return byteArray;
    }
}
