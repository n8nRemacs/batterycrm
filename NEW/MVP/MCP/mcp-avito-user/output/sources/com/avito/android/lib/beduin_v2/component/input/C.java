package com.avito.android.lib.beduin_v2.component.input;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.input.InputState;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputComposeState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/input/C;", "", "_design-modules_beduin-v2_renderer_component_input"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f175635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f175636b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f175637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InputState f175638d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f175639e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f175640f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f175641g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AvitoInputFormat f175642h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f175643i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f175644j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f175645k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f175646l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f175647m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f175648n;

    public C(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k InputState inputState, boolean z13, boolean z14, boolean z15, @Y61.k AvitoInputFormat avitoInputFormat, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.k String str7, boolean z16) {
        this.f175635a = str;
        this.f175636b = str2;
        this.f175637c = z12;
        this.f175638d = inputState;
        this.f175639e = z13;
        this.f175640f = z14;
        this.f175641g = z15;
        this.f175642h = avitoInputFormat;
        this.f175643i = str3;
        this.f175644j = str4;
        this.f175645k = str5;
        this.f175646l = str6;
        this.f175647m = str7;
        this.f175648n = z16;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return L.f(this.f175635a, c12.f175635a) && L.f(this.f175636b, c12.f175636b) && this.f175637c == c12.f175637c && this.f175638d == c12.f175638d && this.f175639e == c12.f175639e && this.f175640f == c12.f175640f && this.f175641g == c12.f175641g && this.f175642h == c12.f175642h && L.f(this.f175643i, c12.f175643i) && L.f(this.f175644j, c12.f175644j) && L.f(this.f175645k, c12.f175645k) && L.f(this.f175646l, c12.f175646l) && L.f(this.f175647m, c12.f175647m) && this.f175648n == c12.f175648n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175648n) + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d((this.f175642h.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f175638d.hashCode() + androidx.appcompat.app.r.i(androidx.compose.foundation.H.d(this.f175635a.hashCode() * 31, 31, this.f175636b), 31, this.f175637c)) * 31, 31, this.f175639e), 31, this.f175640f), 31, this.f175641g)) * 31, 31, this.f175643i), 31, this.f175644j), 31, this.f175645k), 31, this.f175646l), 31, this.f175647m);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputComposeState(text=");
        sb2.append(this.f175635a);
        sb2.append(", placeholder=");
        sb2.append(this.f175636b);
        sb2.append(", enabled=");
        sb2.append(this.f175637c);
        sb2.append(", state=");
        sb2.append(this.f175638d);
        sb2.append(", readOnly=");
        sb2.append(this.f175639e);
        sb2.append(", loading=");
        sb2.append(this.f175640f);
        sb2.append(", clearButton=");
        sb2.append(this.f175641g);
        sb2.append(", format=");
        sb2.append(this.f175642h);
        sb2.append(", startIcon=");
        sb2.append(this.f175643i);
        sb2.append(", endIcon=");
        sb2.append(this.f175644j);
        sb2.append(", prefix=");
        sb2.append(this.f175645k);
        sb2.append(", postfix=");
        sb2.append(this.f175646l);
        sb2.append(", tag=");
        sb2.append(this.f175647m);
        sb2.append(", hasOnDoneAction=");
        return androidx.appcompat.app.r.x(sb2, this.f175648n, ')');
    }
}
