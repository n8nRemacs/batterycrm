package androidx.media3.exoplayer.analytics;

import android.content.SharedPreferences;
import androidx.media3.common.H;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.yandex.mobile.ads.impl.fo;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.m90;
import e11.Y1;
import e11.r2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements r.a, C36604u.a, m90.a, InterfaceC37024g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f48679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48681f;

    public /* synthetic */ n(int i12, Object obj, int i13, Object obj2, Object obj3) {
        this.f48677b = i13;
        this.f48679d = obj;
        this.f48678c = i12;
        this.f48680e = obj2;
        this.f48681f = obj3;
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        switch (this.f48677b) {
            case 0:
                b bVar = (b) obj;
                b.C1823b c1823b = (b.C1823b) this.f48679d;
                bVar.getClass();
                bVar.x(c1823b, (H.k) this.f48680e, (H.k) this.f48681f, this.f48678c);
                break;
            case 1:
                com.google.android.exoplayer2.analytics.b bVar2 = (com.google.android.exoplayer2.analytics.b) obj;
                b.C10568b c10568b = (b.C10568b) this.f48679d;
                bVar2.getClass();
                bVar2.jp(c10568b, (d0.k) this.f48680e, (d0.k) this.f48681f, this.f48678c);
                break;
            default:
                int i12 = this.f48678c;
                gt0.c cVar = (gt0.c) this.f48680e;
                fo.a((k9.a) this.f48679d, i12, cVar, (gt0.c) this.f48681f, (k9) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37024g
    public void onSuccess(Object obj) {
        NX0.b bVar = (NX0.b) obj;
        Y1 y12 = (Y1) this.f48679d;
        y12.getClass();
        int i12 = bVar.f11538b;
        r2 r2Var = (r2) this.f48680e;
        if (i12 != this.f48678c) {
            try {
                SharedPreferences.Editor editorEdit = r2Var.f394776a.edit();
                editorEdit.putInt("asis", i12);
                editorEdit.commit();
            } catch (Throwable th2) {
                th2.toString();
            }
            y12.a("asis", String.valueOf(i12));
        }
        String str = (String) this.f48681f;
        String str2 = bVar.f11537a;
        if (str2.equals(str)) {
            return;
        }
        r2Var.b("asid", str2);
        y12.a("asid", str2);
    }
}
