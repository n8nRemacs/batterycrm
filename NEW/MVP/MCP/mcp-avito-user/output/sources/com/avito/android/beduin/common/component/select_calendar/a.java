package com.avito.android.beduin.common.component.select_calendar;

import L91.o;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.appcompat.app.m;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.beduin.common.component.select_calendar.e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectCalendarComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/a;", "Lej/a;", "Lcom/avito/android/beduin/common/component/select_calendar/BeduinSelectCalendarModel;", "Lcom/avito/android/beduin/common/component/select_calendar/i;", "a", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40112a<BeduinSelectCalendarModel, i> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f102436i = 0;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BeduinSelectCalendarModel f102437e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lj.e f102438f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final e f102439g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public androidx.view.result.h<e.a> f102440h;

    /* compiled from: BeduinSelectCalendarComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/a$a;", "", "<init>", "()V", "", "DEFAULT_DATE_TEXT_FORMAT", "Ljava/lang/String;", CredentialProviderBaseController.TYPE_TAG, "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.select_calendar.a$a, reason: collision with other inner class name */
    public static final class C3068a {
        public /* synthetic */ C3068a(C42822w c42822w) {
            this();
        }

        public C3068a() {
        }
    }

    /* compiled from: BeduinSelectCalendarComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/select_calendar/a$b;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f102441a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final List<String> f102442b = Collections.singletonList("calendarSelect");

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Class<BeduinSelectCalendarModel> f102443c = BeduinSelectCalendarModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinSelectCalendarModel> S() {
            return f102443c;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return f102442b;
        }
    }

    /* compiled from: BeduinSelectCalendarComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102444a;

        static {
            int[] iArr = new int[BeduinSelectCalendarModel.BeduinCalendarSelectionType.values().length];
            try {
                iArr[BeduinSelectCalendarModel.BeduinCalendarSelectionType.MULTIPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinSelectCalendarModel.BeduinCalendarSelectionType.INTERVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102444a = iArr;
        }
    }

    static {
        new C3068a(null);
    }

    public a(@k BeduinSelectCalendarModel beduinSelectCalendarModel, @k lj.e eVar, @k e eVar2) {
        this.f102437e = beduinSelectCalendarModel;
        this.f102438f = eVar;
        this.f102439g = eVar2;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102437e;
    }

    @Override // ej.AbstractC40112a
    public final InterfaceC40116e i(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Context context = viewGroup.getContext();
        BeduinSelectCalendarModel beduinSelectCalendarModel = this.f102437e;
        return new i(new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(beduinSelectCalendarModel.getTheme())), layoutParams, beduinSelectCalendarModel);
    }

    @Override // ej.AbstractC40112a
    public final void m(InterfaceC40116e interfaceC40116e) {
        m mVarC;
        i iVar = (i) interfaceC40116e;
        androidx.view.result.h<e.a> hVar = this.f102440h;
        if (hVar != null) {
            hVar.c();
        }
        this.f102440h = null;
        ComponentContainer componentContainer = iVar.f102462b;
        ComponentContainer componentContainer2 = componentContainer != null ? componentContainer : null;
        BeduinSelectCalendarModel beduinSelectCalendarModel = this.f102437e;
        if (componentContainer2 != null && (mVarC = C35835l0.c(componentContainer2.getContext())) != null) {
            this.f102440h = mVarC.getActivityResultRegistry().e("BeduinCalendarSelect" + this.f102438f.getF103350r() + '_' + beduinSelectCalendarModel.getF100853b(), this.f102439g, new o(this, 15));
        }
        Input input = iVar.f102463c;
        Input.t(input, beduinSelectCalendarModel.getText(), false, 6);
        String placeholder = beduinSelectCalendarModel.getPlaceholder();
        if (placeholder != null) {
            input.setHint(placeholder);
        }
        Boolean canClear = beduinSelectCalendarModel.getCanClear();
        boolean zBooleanValue = canClear != null ? canClear.booleanValue() : false;
        input.setClearButtonVisibleUnfocused(zBooleanValue);
        input.setClearButton(zBooleanValue);
        com.avito.android.beduin.common.component.select_calendar.b bVar = zBooleanValue ? new com.avito.android.beduin.common.component.select_calendar.b(this) : null;
        input.setClearButtonClickListener(bVar != null ? new com.avito.android.advert.item.compatibility.v2.m(11, bVar) : null);
        String errorMessage = beduinSelectCalendarModel.getErrorMessage();
        if (errorMessage == null || errorMessage.length() == 0) {
            componentContainer.q(null);
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
        } else {
            ComponentContainer.n(componentContainer, beduinSelectCalendarModel.getErrorMessage(), 2);
            Input.f179303W.getClass();
            input.setState(Input.f179305b0);
        }
        input.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 8));
    }
}
