package com.avito.android.beduin.common.component.favorite_button;

import Y41.l;
import com.avito.android.beduin.common.component.e;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinFavoriteButtonChange.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonChange;", "", "Lcom/avito/android/beduin/common/component/e$a;", "Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinFavoriteButtonChange implements e.a<BeduinFavoriteButtonModel> {

    /* renamed from: c, reason: collision with root package name */
    public static final BeduinFavoriteButtonChange f101170c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BeduinFavoriteButtonChange[] f101171d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101172e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<BeduinFavoriteButtonModel, Object> f101173b;

    /* compiled from: BeduinFavoriteButtonChange.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonModel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinFavoriteButtonModel, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f101174l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(BeduinFavoriteButtonModel beduinFavoriteButtonModel) {
            return Boolean.valueOf(beduinFavoriteButtonModel.getIsFavorite());
        }
    }

    static {
        BeduinFavoriteButtonChange beduinFavoriteButtonChange = new BeduinFavoriteButtonChange(a.f101174l);
        f101170c = beduinFavoriteButtonChange;
        BeduinFavoriteButtonChange[] beduinFavoriteButtonChangeArr = {beduinFavoriteButtonChange};
        f101171d = beduinFavoriteButtonChangeArr;
        f101172e = kotlin.enums.c.a(beduinFavoriteButtonChangeArr);
    }

    public BeduinFavoriteButtonChange(l lVar) {
        this.f101173b = lVar;
    }

    public static BeduinFavoriteButtonChange valueOf(String str) {
        return (BeduinFavoriteButtonChange) Enum.valueOf(BeduinFavoriteButtonChange.class, str);
    }

    public static BeduinFavoriteButtonChange[] values() {
        return (BeduinFavoriteButtonChange[]) f101171d.clone();
    }

    @Override // com.avito.android.beduin.common.component.e.a
    public final BeduinModel a(BeduinModel beduinModel) {
        return BeduinFavoriteButtonModel.a((BeduinFavoriteButtonModel) beduinModel, false);
    }
}
