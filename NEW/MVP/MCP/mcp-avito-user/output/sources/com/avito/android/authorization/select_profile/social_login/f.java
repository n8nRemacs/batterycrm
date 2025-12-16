package com.avito.android.authorization.select_profile.social_login;

import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import kotlin.Metadata;

/* compiled from: SocialRegistrationSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94389b;

    public f(j jVar) {
        this.f94389b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectProfileField selectProfileField = (SelectProfileField) obj;
        j jVar = this.f94389b;
        jVar.getClass();
        if (selectProfileField instanceof SelectProfileField.Profile) {
            jVar.f((SelectProfileField.Profile) selectProfileField);
        }
    }
}
