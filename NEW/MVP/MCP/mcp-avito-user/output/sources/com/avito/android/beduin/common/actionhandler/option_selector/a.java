package com.avito.android.beduin.common.actionhandler.option_selector;

import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: Selector.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$Option;", "invoke", "(Lcom/avito/android/beduin/common/action/OpenOptionSelectorAction$Option;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class a extends N implements Y41.l<OpenOptionSelectorAction.Option, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f100300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar) {
        super(1);
        this.f100300l = dVar;
    }

    @Override // Y41.l
    public final Boolean invoke(OpenOptionSelectorAction.Option option) {
        return Boolean.valueOf(L.f(option.getId(), this.f100300l.f100303E));
    }
}
