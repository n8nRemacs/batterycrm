package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.my.target.G;
import com.my.target.k1;
import e11.AbstractC39895p;
import e11.C39848C;
import e11.C39865f;
import e11.J1;
import java.util.ArrayList;

/* renamed from: com.my.target.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37823z extends AbstractC37792j {

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39848C f365228d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final ArrayList<C39865f> f365229e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public C37803o0 f365230f;

    /* renamed from: com.my.target.z$a */
    public static class a implements G.a {
        @Override // com.my.target.i1.a
        public final void a() {
            throw null;
        }

        @Override // com.my.target.i1.a
        public final void b(@j.N AbstractC39895p abstractC39895p, @j.N View view) {
            throw null;
        }

        @Override // com.my.target.G.a
        public final void c() {
            throw null;
        }

        @Override // com.my.target.i1.a
        public final void d(@j.N AbstractC39895p abstractC39895p, @j.N Context context) {
            throw null;
        }

        @Override // com.my.target.G.a
        public final void e(float f12, float f13, @j.N Context context) {
            throw null;
        }

        @Override // com.my.target.i1.a
        public final void f(@j.P AbstractC39895p abstractC39895p, @j.P String str, @j.N Context context) {
            J1 j12 = new J1();
            if (TextUtils.isEmpty(str)) {
                throw null;
            }
            j12.a(null, str, context);
            throw null;
        }

        @Override // com.my.target.G.a
        public final void g(@j.N AbstractC39895p abstractC39895p, @j.N String str, @j.N Context context) {
            throw null;
        }

        @Override // com.my.target.G.a
        public final void a(@j.N WebView webView) {
            throw null;
        }

        @Override // com.my.target.G.a
        public final void b(@j.N Context context) {
            throw null;
        }
    }

    public C37823z(@j.N C39848C c39848c, @j.N e11.W0 w02, @j.N k1.a aVar) {
        super(aVar);
        this.f365228d = c39848c;
        ArrayList<C39865f> arrayList = new ArrayList<>();
        this.f365229e = arrayList;
        arrayList.addAll(c39848c.f394702a.f());
    }
}
