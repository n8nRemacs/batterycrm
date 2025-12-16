package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DisclaimerItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.travel_onboarding.ui.items.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35257s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C35257s f302432a = new C35257s();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f302433b = new C22096n(-829863004, a.f302435l, false);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22096n f302434c = new C22096n(198899370, b.f302436l, false);

    /* compiled from: DisclaimerItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.travel_onboarding.ui.items.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f302435l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                AttributedText attributedText = new AttributedText("very long text very long text very long text very long text very long text very long text very long text very long text very long text very long text very long text", C42784z0.f406748b, 1);
                r rVar = r.f302431l;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                P.a(3526, rVar, a13, R1.i(androidx.compose.ui.v.f42878y1, 16), attributedText, ConstraintKt.WARNING);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DisclaimerItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.travel_onboarding.ui.items.s$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f302436l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                AttributedText attributedText = new AttributedText("very long text very long text very long text very long text very long text very long text very long text very long text very long text very long text very long text", C42784z0.f406748b, 1);
                C35258t c35258t = C35258t.f302437l;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                P.a(3526, c35258t, a13, R1.i(androidx.compose.ui.v.f42878y1, 16), attributedText, "some random icon");
            }
            return G0.f406611a;
        }
    }
}
