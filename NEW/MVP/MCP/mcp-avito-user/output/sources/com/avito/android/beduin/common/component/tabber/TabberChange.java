package com.avito.android.beduin.common.component.tabber;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabberChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/TabberChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/tabber/BeduinTabberModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabberChange implements e.a<BeduinTabberModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final TabberChange f102751c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TabberChange[] f102752d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102753e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<BeduinTabberModel, Object> f102754b;

    /* compiled from: TabberChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/tabber/BeduinTabberModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinTabberModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102755l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinTabberModel beduinTabberModel) {
            return beduinTabberModel.getSelectedTabId();
        }
    }

    static {
        TabberChange tabberChange = new TabberChange(a.f102755l);
        f102751c = tabberChange;
        TabberChange[] tabberChangeArr = {tabberChange};
        f102752d = tabberChangeArr;
        f102753e = kotlin.enums.c.a(tabberChangeArr);
    }

    public TabberChange(l lVar) {
        this.f102754b = lVar;
    }

    public static TabberChange valueOf(String str) {
        return (TabberChange) Enum.valueOf(TabberChange.class, str);
    }

    public static TabberChange[] values() {
        return (TabberChange[]) f102752d.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinTabberModel.copy$default((BeduinTabberModel) beduinModel, null, null, null, null, null, null, null, 95, null);
    }
}
