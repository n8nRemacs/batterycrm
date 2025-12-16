package com.avito.android.beduin.common.component.selector_card_group;

import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinSelectorCardGroupChange.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSelectorCardGroupChange implements e.a<BeduinSelectorCardGroupModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinSelectorCardGroupChange f102512c;

    /* renamed from: d, reason: collision with root package name */
    public static final BeduinSelectorCardGroupChange f102513d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BeduinSelectorCardGroupChange[] f102514e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102515f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f102516b;

    /* compiled from: BeduinSelectorCardGroupChange.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinSelectorCardGroupModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102517l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinSelectorCardGroupModel beduinSelectorCardGroupModel) {
            List<BeduinSelectorCardGroupModel.Option> listF = beduinSelectorCardGroupModel.f();
            ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(((BeduinSelectorCardGroupModel.Option) it.next()).getComponents());
            }
            return arrayList;
        }
    }

    /* compiled from: BeduinSelectorCardGroupChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinSelectorCardGroupModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f102518l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinSelectorCardGroupModel beduinSelectorCardGroupModel) {
            return beduinSelectorCardGroupModel.h();
        }
    }

    static {
        BeduinSelectorCardGroupChange beduinSelectorCardGroupChange = new BeduinSelectorCardGroupChange(0, a.f102517l, "OptionsComponents");
        f102512c = beduinSelectorCardGroupChange;
        BeduinSelectorCardGroupChange beduinSelectorCardGroupChange2 = new BeduinSelectorCardGroupChange(1, b.f102518l, "SelectedIds");
        f102513d = beduinSelectorCardGroupChange2;
        BeduinSelectorCardGroupChange[] beduinSelectorCardGroupChangeArr = {beduinSelectorCardGroupChange, beduinSelectorCardGroupChange2};
        f102514e = beduinSelectorCardGroupChangeArr;
        f102515f = kotlin.enums.c.a(beduinSelectorCardGroupChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectorCardGroupChange(int i12, Y41.l lVar, String str) {
        this.f102516b = (N) lVar;
    }

    public static BeduinSelectorCardGroupChange valueOf(String str) {
        return (BeduinSelectorCardGroupChange) Enum.valueOf(BeduinSelectorCardGroupChange.class, str);
    }

    public static BeduinSelectorCardGroupChange[] values() {
        return (BeduinSelectorCardGroupChange[]) f102514e.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel = (BeduinSelectorCardGroupModel) beduinModel;
        List<BeduinSelectorCardGroupModel.Option> listF = beduinSelectorCardGroupModel.f();
        ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(BeduinSelectorCardGroupModel.Option.a((BeduinSelectorCardGroupModel.Option) it.next(), C42784z0.f406748b));
        }
        return BeduinSelectorCardGroupModel.a(beduinSelectorCardGroupModel, null, arrayList, null, null, false, false, 65327);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @Y61.k
    public final Y41.l<BeduinSelectorCardGroupModel, Object> b() {
        return this.f102516b;
    }
}
