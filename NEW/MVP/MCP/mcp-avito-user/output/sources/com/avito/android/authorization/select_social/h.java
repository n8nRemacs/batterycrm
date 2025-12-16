package com.avito.android.authorization.select_social;

import ae.C19875c;
import com.avito.android.authorization.select_social.adapter.SelectSocialField;
import kotlin.Metadata;

/* compiled from: SelectSocialPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/authorization/select_social/adapter/SelectSocialField;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/authorization/select_social/adapter/SelectSocialField;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f94535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f94536c;

    public h(n nVar, s sVar) {
        this.f94535b = sVar;
        this.f94536c = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectSocialField selectSocialField = (SelectSocialField) obj;
        if (selectSocialField instanceof SelectSocialField.Social) {
            this.f94535b.c();
            String type = ((SelectSocialField.Social) selectSocialField).f94473c.getType();
            n nVar = this.f94536c;
            nVar.f94551h.c(new C19875c("auth", type));
            SelectSocialActivity selectSocialActivity = nVar.f94554k;
            if (selectSocialActivity != null) {
                l90.o oVar = selectSocialActivity.f94466m;
                if (oVar == null) {
                    oVar = null;
                }
                selectSocialActivity.startActivityForResult(oVar.a(type), 1);
            }
        }
    }
}
