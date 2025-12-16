package com.avito.android.beduin.common.component.emotions;

import Ui.InterfaceC15523b;
import Y61.k;
import android.R;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.emotions.BeduinEmotionsModel;
import com.avito.android.beduin.common.component.emotions.EmotionRatingBar;
import com.avito.android.beduin.common.container.spread.Alignment;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinEmotionsComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel;", "Lcom/avito/android/beduin/common/component/emotions/EmotionRatingBar;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.beduin.common.component.h<BeduinEmotionsModel, EmotionRatingBar> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C3033a f101153h = new C3033a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final List<String> f101154i = Collections.singletonList("emotions");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Class<BeduinEmotionsModel> f101155j = BeduinEmotionsModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinEmotionsModel f101156e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101157f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final lj.e f101158g;

    /* compiled from: BeduinEmotionsComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.emotions.a$a, reason: collision with other inner class name */
    public static final class C3033a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3033a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinEmotionsModel> S() {
            return a.f101155j;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f101154i;
        }

        public C3033a() {
        }
    }

    /* compiled from: BeduinEmotionsComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101159a;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101159a = iArr;
        }
    }

    public a(@k BeduinEmotionsModel beduinEmotionsModel, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k lj.e eVar) {
        this.f101156e = beduinEmotionsModel;
        this.f101157f = interfaceC15523b;
        this.f101158g = eVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101156e;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinEmotionsModel beduinEmotionsModel = (BeduinEmotionsModel) beduinModel;
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        BeduinEmotionsChange[] beduinEmotionsChangeArrValues = BeduinEmotionsChange.values();
        if (beduinEmotionsChangeArrValues.length == 0) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, BeduinEmotionsChange.class, new StringBuilder("Changes enum must have values! ")).toString());
        }
        com.avito.android.beduin.common.component.f fVar = new com.avito.android.beduin.common.component.f(C42756l.C(beduinEmotionsChangeArrValues));
        BeduinEmotionsModel beduinEmotionsModel2 = this.f101156e;
        if (!L.f(fVar.invoke(beduinEmotionsModel2), fVar.invoke(beduinEmotionsModel))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BeduinEmotionsChange beduinEmotionsChange : beduinEmotionsChangeArrValues) {
            if (!L.f(beduinEmotionsChange.b().invoke(beduinEmotionsModel2), beduinEmotionsChange.b().invoke(beduinEmotionsModel))) {
                arrayList.add(beduinEmotionsChange);
            }
        }
        return new e.b(C42745f0.P0(arrayList));
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        EmotionRatingBar emotionRatingBar = new EmotionRatingBar(viewGroup.getContext(), null, 0, 0, 14, null);
        emotionRatingBar.setId(View.generateViewId());
        emotionRatingBar.setLayoutParams(layoutParams);
        return emotionRatingBar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        EmotionRatingBar emotionRatingBar = (EmotionRatingBar) view;
        Context context = emotionRatingBar.getContext();
        BeduinEmotionsModel beduinEmotionsModel = this.f101156e;
        List<BeduinEmotionsModel.Option> options = beduinEmotionsModel.getOptions();
        ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
        Iterator<T> it = options.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BeduinEmotionsModel.Option option = (BeduinEmotionsModel.Option) it.next();
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_selected}, v.c(context, option.getSelectedIcon(), null));
            stateListDrawable.addState(StateSet.WILD_CARD, v.c(context, option.getDeselectedIcon(), null));
            arrayList.add(new EmotionRatingBar.b(option.getId(), 0, new EmotionRatingBar.c(null, stateListDrawable, 1, null), 2, null));
        }
        EmotionRatingBar.ContentMode contentMode = (beduinEmotionsModel.getAlignment() == null || beduinEmotionsModel.getAlignment() == Alignment.SPREAD) ? EmotionRatingBar.ContentMode.f101142b : EmotionRatingBar.ContentMode.f101143c;
        Alignment alignment = beduinEmotionsModel.getAlignment();
        int i12 = alignment == null ? -1 : b.f101159a[alignment.ordinal()];
        EmotionRatingBar.Alignment alignment2 = i12 != 1 ? i12 != 2 ? EmotionRatingBar.Alignment.f101139d : EmotionRatingBar.Alignment.f101138c : EmotionRatingBar.Alignment.f101137b;
        Boolean boolIsEnabled = beduinEmotionsModel.isEnabled();
        emotionRatingBar.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        emotionRatingBar.setEmotions(arrayList);
        emotionRatingBar.setSelectedId(beduinEmotionsModel.getSelectedId());
        emotionRatingBar.setOnChangeListener(new com.avito.android.beduin.common.component.emotions.b(this));
        Integer interItemSpacing = beduinEmotionsModel.getInterItemSpacing();
        emotionRatingBar.f101134i = contentMode;
        if (interItemSpacing != null) {
            emotionRatingBar.f101135j = y6.b(interItemSpacing.intValue());
        }
        emotionRatingBar.f101136k = alignment2;
        emotionRatingBar.h();
        emotionRatingBar.setImageSize(beduinEmotionsModel.getSize());
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        com.avito.android.beduin.common.component.e eVar = com.avito.android.beduin.common.component.e.f101116a;
        c cVar = new c((EmotionRatingBar) view, this);
        eVar.getClass();
        com.avito.android.beduin.common.component.e.a(cVar, list);
    }
}
