package com.avito.android.profile_phones.add_phone;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.toolbar.AppBarLayoutWithIconAction;

/* compiled from: AddPhoneFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AddPhoneFragment f226872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddPhoneFragment addPhoneFragment) {
        super(1);
        this.f226872l = addPhoneFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AppBarLayoutWithIconAction appBarLayoutWithIconAction = this.f226872l.f226804o0;
        if (appBarLayoutWithIconAction == null) {
            appBarLayoutWithIconAction = null;
        }
        appBarLayoutWithIconAction.setExpanded(!zBooleanValue);
        return G0.f406611a;
    }
}
