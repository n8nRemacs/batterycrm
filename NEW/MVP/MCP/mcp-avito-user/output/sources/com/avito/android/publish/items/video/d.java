package com.avito.android.publish.items.video;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.util.C35857n6;
import com.avito.android.validation.j1;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: VideoItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/items/video/d;", "Lcom/avito/android/publish/items/video/c;", "Lcom/avito/android/validation/j1;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c, j1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f237206b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f237207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> f237208d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237209e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237210f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237211g;

    /* compiled from: VideoItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f237212a;

        static {
            int[] iArr = new int[ItemWithAdditionalButton.AdditionalButtonType.values().length];
            try {
                ItemWithAdditionalButton.AdditionalButtonType additionalButtonType = ItemWithAdditionalButton.AdditionalButtonType.f173894b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f237212a = iArr;
        }
    }

    @Inject
    public d() {
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237206b = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f237207c = cVar2;
        com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f237208d = cVar3;
        this.f237209e = cVar;
        this.f237210f = cVar2;
        this.f237211g = cVar3;
    }

    public static void O(k kVar, ParameterElement.I.a aVar, ItemWithState.State state) {
        if ((state instanceof ItemWithState.State.Error) || (state instanceof ItemWithState.State.Warning)) {
            kVar.O8();
            return;
        }
        if (aVar instanceof ParameterElement.I.a.C3416a) {
            ParameterElement.I.a.C3416a c3416a = (ParameterElement.I.a.C3416a) aVar;
            kVar.RC(c3416a.f117332b, c3416a.f117331a);
        } else if (aVar instanceof ParameterElement.I.a.c) {
            kVar.v9(((ParameterElement.I.a.c) aVar).f117335a);
        } else if (aVar instanceof ParameterElement.I.a.d) {
            kVar.IW();
        } else if (aVar instanceof ParameterElement.I.a.b) {
            kVar.O8();
        }
    }

    public static void V(k kVar, ItemWithState.State state) {
        if (state instanceof ItemWithState.State.Normal) {
            kVar.IA();
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            kVar.H40(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            kVar.H40(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            kVar.H40(null);
        }
    }

    @Override // com.avito.android.publish.items.video.c
    @Y61.k
    /* renamed from: G, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF237211g() {
        return this.f237211g;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (ParameterElement.I) aVar);
    }

    @Override // com.avito.android.publish.items.video.c, com.avito.android.validation.j1
    @Y61.k
    public final z<com.avito.android.items.a> b() {
        return this.f237209e;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        ParameterElement.I i13 = (ParameterElement.I) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35857n6) {
                obj = obj2;
            }
        }
        C35857n6 c35857n6 = (C35857n6) (obj instanceof C35857n6 ? obj : null);
        if (c35857n6 == null) {
            k(kVar, i13);
            return;
        }
        ItemWithState.State state = c35857n6.f318936a;
        if (state != null) {
            V(kVar, state);
        }
        ParameterElement.I.a aVar2 = c35857n6.f318937b;
        if (aVar2 != null) {
            O(kVar, aVar2, state);
        }
        kVar.K(new g(i13, this));
        kVar.t1(new h(i13, this));
    }

    public final void k(@Y61.k k kVar, @Y61.k ParameterElement.I i12) {
        kVar.K(null);
        kVar.m7();
        kVar.setTitle(i12.f117324e);
        kVar.o(i12.f117325f);
        kVar.T0(new FormatterType(Integer.MAX_VALUE, 1, null));
        kVar.h0();
        kVar.I0(Integer.MAX_VALUE);
        kVar.m(i12.f117329j);
        kVar.t1(new e(i12, this));
        kVar.K(new f(i12, this));
        V(kVar, i12.f117330k);
        O(kVar, i12.f117327h, i12.f117330k);
        ItemWithAdditionalButton.AdditionalButton additionalButton = i12.f117328i;
        ItemWithAdditionalButton.AdditionalButtonType additionalButtonType = additionalButton != null ? additionalButton.f173890b : null;
        if ((additionalButtonType == null ? -1 : a.f237212a[additionalButtonType.ordinal()]) == 1) {
            kVar.S7(new i(i12, this));
        } else {
            kVar.S7(null);
        }
    }

    @Override // com.avito.android.publish.items.video.c
    @Y61.k
    public final z<Q<Boolean, com.avito.android.items.a>> n() {
        return this.f237210f;
    }
}
