package com.avito.android.user_advert.advert;

import androidx.appcompat.widget.Toolbar;
import com.avito.android.util.P5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/component/appbar/ActionMenu;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.advert.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35444p0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35436m1 f310577b;

    public C35444p0(C35436m1 c35436m1) {
        this.f310577b = c35436m1;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Toolbar toolbar = this.f310577b.f310565t;
        toolbar.getMenu().clear();
        int i12 = 0;
        for (T t12 : (List) obj) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            P5.a(toolbar, i12, (ActionMenu) t12);
            i12 = i13;
        }
    }
}
