package com.avito.android.beduin.common.component.top_toolbar;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TopToolbarChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/TopToolbarChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TopToolbarChange implements e.a<BeduinTopToolbarModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final TopToolbarChange f102797c;

    /* renamed from: d, reason: collision with root package name */
    public static final TopToolbarChange f102798d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TopToolbarChange[] f102799e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102800f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f102801b;

    /* compiled from: TopToolbarChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinTopToolbarModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102802l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinTopToolbarModel beduinTopToolbarModel) {
            return beduinTopToolbarModel.getTitle();
        }
    }

    /* compiled from: TopToolbarChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<BeduinTopToolbarModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f102803l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinTopToolbarModel beduinTopToolbarModel) {
            return beduinTopToolbarModel.getRightItems();
        }
    }

    static {
        TopToolbarChange topToolbarChange = new TopToolbarChange(0, a.f102802l, "Title");
        f102797c = topToolbarChange;
        TopToolbarChange topToolbarChange2 = new TopToolbarChange(1, b.f102803l, "RightItems");
        f102798d = topToolbarChange2;
        TopToolbarChange[] topToolbarChangeArr = {topToolbarChange, topToolbarChange2};
        f102799e = topToolbarChangeArr;
        f102800f = kotlin.enums.c.a(topToolbarChangeArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopToolbarChange(int i12, l lVar, String str) {
        this.f102801b = (N) lVar;
    }

    public static TopToolbarChange valueOf(String str) {
        return (TopToolbarChange) Enum.valueOf(TopToolbarChange.class, str);
    }

    public static TopToolbarChange[] values() {
        return (TopToolbarChange[]) f102799e.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinTopToolbarModel.copy$default((BeduinTopToolbarModel) beduinModel, null, "", null, null, null, null, null, null, 189, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l<com.avito.android.beduin.common.component.top_toolbar.BeduinTopToolbarModel, java.lang.Object>, kotlin.jvm.internal.N] */
    @k
    public final l<BeduinTopToolbarModel, Object> b() {
        return this.f102801b;
    }
}
