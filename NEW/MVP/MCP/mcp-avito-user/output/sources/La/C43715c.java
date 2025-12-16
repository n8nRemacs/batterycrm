package la;

import android.content.res.Resources;
import com.avito.android.R;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsHtmlDescriptionModule_ProvideHtmlRenderOptionsFactory.java */
@e
@y
@x
/* renamed from: la.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C43715c implements h<hJ.h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f413905a;

    public C43715c(l lVar) {
        this.f413905a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f413905a.f393949a;
        C43714b.f413904a.getClass();
        return new hJ.h((int) resources.getDimension(R.dimen.advert_description_list_bullet_left_margin), (int) resources.getDimension(R.dimen.advert_description_list_bullet_right_margin), (int) resources.getDimension(R.dimen.advert_description_list_bullet_symbol_width), "—", false, (int) resources.getDimension(R.dimen.advert_description_paragraph_space_margin), 16, null);
    }
}
