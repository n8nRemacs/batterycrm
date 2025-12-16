package com.avito.android.beduin.common.component.button;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ButtonChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/button/ButtonChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonChange implements e.a<BeduinButtonModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final ButtonChange f100769c;

    /* renamed from: d, reason: collision with root package name */
    public static final ButtonChange f100770d;

    /* renamed from: e, reason: collision with root package name */
    public static final ButtonChange f100771e;

    /* renamed from: f, reason: collision with root package name */
    public static final ButtonChange f100772f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ButtonChange[] f100773g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100774h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f100775b;

    /* compiled from: ButtonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinButtonModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f100776l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinButtonModel beduinButtonModel) {
            return beduinButtonModel.getTitle();
        }
    }

    /* compiled from: ButtonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinButtonModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f100777l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinButtonModel beduinButtonModel) {
            return beduinButtonModel.isEnabled();
        }
    }

    /* compiled from: ButtonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<BeduinButtonModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f100778l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinButtonModel beduinButtonModel) {
            return beduinButtonModel.isLoading();
        }
    }

    /* compiled from: ButtonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements l<BeduinButtonModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f100779l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinButtonModel beduinButtonModel) {
            return beduinButtonModel.getActions();
        }
    }

    static {
        ButtonChange buttonChange = new ButtonChange(0, a.f100776l, "Title");
        f100769c = buttonChange;
        ButtonChange buttonChange2 = new ButtonChange(1, b.f100777l, "IsEnabled");
        f100770d = buttonChange2;
        ButtonChange buttonChange3 = new ButtonChange(2, c.f100778l, "IsLoading");
        f100771e = buttonChange3;
        ButtonChange buttonChange4 = new ButtonChange(3, d.f100779l, "Actions");
        f100772f = buttonChange4;
        ButtonChange[] buttonChangeArr = {buttonChange, buttonChange2, buttonChange3, buttonChange4};
        f100773g = buttonChangeArr;
        f100774h = kotlin.enums.c.a(buttonChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonChange(int i12, l lVar, String str) {
        this.f100775b = (N) lVar;
    }

    public static ButtonChange valueOf(String str) {
        return (ButtonChange) Enum.valueOf(ButtonChange.class, str);
    }

    public static ButtonChange[] values() {
        return (ButtonChange[]) f100773g.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinButtonModel.copy$default((BeduinButtonModel) beduinModel, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 61245, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.button.BeduinButtonModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @k
    public final l<BeduinButtonModel, Object> b() {
        return this.f100775b;
    }
}
