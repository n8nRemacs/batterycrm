package com.avito.android.mortgage.widgets;

import Y41.l;
import Y41.p;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.text.C20973n1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.input.InputState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SmsCodeInput.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f204020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f204021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l<String, G0> f204022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f204023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f204024p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InputState f204025q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20973n1 f204026r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20585k.j f204027s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f204028t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f204029u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, int i12, l lVar, v.a aVar, boolean z12, InputState inputState, C20973n1 c20973n1, C20585k.j jVar, int i13, int i14) {
        super(2);
        this.f204020l = str;
        this.f204021m = i12;
        this.f204022n = lVar;
        this.f204023o = aVar;
        this.f204024p = z12;
        this.f204025q = inputState;
        this.f204026r = c20973n1;
        this.f204027s = jVar;
        this.f204028t = i13;
        this.f204029u = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f204028t | 1);
        InputState inputState = this.f204025q;
        i.a(this.f204020l, this.f204021m, this.f204022n, this.f204023o, this.f204024p, inputState, this.f204026r, this.f204027s, a12, iA2, this.f204029u);
        return G0.f406611a;
    }
}
