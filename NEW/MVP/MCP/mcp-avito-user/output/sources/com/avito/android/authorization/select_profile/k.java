package com.avito.android.authorization.select_profile;

import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import kotlin.Metadata;

/* compiled from: SelectProfilePresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/authorization/select_profile/adapter/SelectProfileField;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectProfilePresenterImpl f94333b;

    public k(SelectProfilePresenterImpl selectProfilePresenterImpl) {
        this.f94333b = selectProfilePresenterImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SelectProfileField selectProfileField = (SelectProfileField) obj;
        if (selectProfileField instanceof SelectProfileField.Profile) {
            SelectProfilePresenterImpl.c(this.f94333b, ((SelectProfileField.Profile) selectProfileField).f94260c);
        } else {
            if (selectProfileField instanceof SelectProfileField.Text) {
                return;
            }
            boolean z12 = selectProfileField instanceof SelectProfileField.Title;
        }
    }
}
