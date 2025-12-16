package com.avito.android.beduin.common.component.favorite_button;

import Y41.l;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFavoriteButtonComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/favorite_button/BeduinFavoriteButtonChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<BeduinFavoriteButtonChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f101190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f101191m;

    /* compiled from: BeduinFavoriteButtonComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101192a;

        static {
            int[] iArr = new int[BeduinFavoriteButtonChange.values().length];
            try {
                iArr[BeduinFavoriteButtonChange.f101170c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f101192a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, CheckableImageButton checkableImageButton) {
        super(1);
        this.f101190l = bVar;
        this.f101191m = checkableImageButton;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinFavoriteButtonChange beduinFavoriteButtonChange) {
        if (a.f101192a[beduinFavoriteButtonChange.ordinal()] == 1) {
            b bVar = this.f101190l;
            boolean isFavorite = bVar.f101183e.getIsFavorite();
            CheckableImageButton checkableImageButton = this.f101191m;
            checkableImageButton.setChecked(isFavorite);
            checkableImageButton.setOnClickListener(new com.avito.android.beduin.common.component.favorite_button.a(bVar, isFavorite, checkableImageButton));
        }
        return G0.f406611a;
    }
}
