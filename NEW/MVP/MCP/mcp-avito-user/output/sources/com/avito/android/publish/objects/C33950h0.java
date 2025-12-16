package com.avito.android.publish.objects;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.publish.details.C33789t;
import kotlin.Metadata;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/items/a;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.objects.h0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33950h0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33975x f238044b;

    public C33950h0(C33975x c33975x) {
        this.f238044b = c33975x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        C33789t c33789t;
        N0 n02;
        kotlin.Q q12 = (kotlin.Q) obj;
        boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
        com.avito.android.items.a aVar = (com.avito.android.items.a) q12.f406620c;
        C33975x c33975x = this.f238044b;
        boolean z12 = c33975x.f238121V;
        if (z12 && !zBooleanValue) {
            c33975x.f238125Z.a(aVar);
        }
        if (!z12 || !(((ParameterElement.p) aVar).f117487l instanceof ParameterElement.m.a) || (c33789t = c33975x.f238129d0) == null || (n02 = c33789t.f234946f) == null) {
            return;
        }
        n02.f237524c = zBooleanValue;
        ShadowFrameLayout shadowFrameLayout = n02.f237525d;
        if (shadowFrameLayout != null) {
            n02.a(shadowFrameLayout, n02.f237523b, zBooleanValue);
        }
    }
}
