package androidx.media3.session;

import androidx.media3.session.A1;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C23242m1 implements A1.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f52586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52587d;

    public /* synthetic */ C23242m1(int i12, Object obj, boolean z12) {
        this.f52585b = i12;
        this.f52587d = obj;
        this.f52586c = z12;
    }

    @Override // androidx.media3.session.A1.e
    public final Object d(T0 t02, O0.g gVar, int i12) {
        Object obj = this.f52587d;
        boolean z12 = this.f52586c;
        switch (this.f52585b) {
            case 0:
                int i13 = A1.f51915u;
                return t02.i(gVar, AbstractC37401r1.E((androidx.media3.common.z) obj), z12 ? -1 : t02.f52302p.getCurrentMediaItemIndex(), z12 ? -9223372036854775807L : t02.f52302p.getCurrentPosition());
            default:
                int i14 = A1.f51915u;
                return t02.i(gVar, (List) obj, z12 ? -1 : t02.f52302p.getCurrentMediaItemIndex(), z12 ? -9223372036854775807L : t02.f52302p.getCurrentPosition());
        }
    }
}
