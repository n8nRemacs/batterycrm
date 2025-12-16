package com.avito.android.beduin.common.component.emotions;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinEmotionsChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinEmotionsChange implements e.a<BeduinEmotionsModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinEmotionsChange f101118c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinEmotionsChange f101119d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BeduinEmotionsChange[] f101120e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101121f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f101122b;

    /* compiled from: BeduinEmotionsChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinEmotionsModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101123l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinEmotionsModel beduinEmotionsModel) {
            return beduinEmotionsModel.isEnabled();
        }
    }

    /* compiled from: BeduinEmotionsChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/emotions/BeduinEmotionsModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinEmotionsModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101124l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinEmotionsModel beduinEmotionsModel) {
            return beduinEmotionsModel.getSelectedId();
        }
    }

    static {
        BeduinEmotionsChange beduinEmotionsChange = new BeduinEmotionsChange(0, a.f101123l, "IsEnabled");
        f101118c = beduinEmotionsChange;
        BeduinEmotionsChange beduinEmotionsChange2 = new BeduinEmotionsChange(1, b.f101124l, "SelectedId");
        f101119d = beduinEmotionsChange2;
        BeduinEmotionsChange[] beduinEmotionsChangeArr = {beduinEmotionsChange, beduinEmotionsChange2};
        f101120e = beduinEmotionsChangeArr;
        f101121f = kotlin.enums.c.a(beduinEmotionsChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinEmotionsChange(int i12, l lVar, String str) {
        this.f101122b = (N) lVar;
    }

    public static BeduinEmotionsChange valueOf(String str) {
        return (BeduinEmotionsChange) Enum.valueOf(BeduinEmotionsChange.class, str);
    }

    public static BeduinEmotionsChange[] values() {
        return (BeduinEmotionsChange[]) f101120e.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinEmotionsModel.copy$default((BeduinEmotionsModel) beduinModel, null, null, null, null, null, null, null, null, null, 499, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.emotions.BeduinEmotionsModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @k
    public final l<BeduinEmotionsModel, Object> b() {
        return this.f101122b;
    }
}
