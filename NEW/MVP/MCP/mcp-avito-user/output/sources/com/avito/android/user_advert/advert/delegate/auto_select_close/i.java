package com.avito.android.user_advert.advert.delegate.auto_select_close;

import Y61.l;
import com.avito.android.remote.model.MyAdvertAutoSelect;
import com.avito.android.remote.model.my_advert.CloseReason;
import fH0.InterfaceC40292b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutoSelectDialogPresenterDelegateAction.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_select_close/i;", "LfH0/b;", "<init>", "()V", "a", "Lcom/avito/android/user_advert/advert/delegate/auto_select_close/i$a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class i implements InterfaceC40292b {

    /* compiled from: AutoSelectDialogPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/auto_select_close/i$a;", "Lcom/avito/android/user_advert/advert/delegate/auto_select_close/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MyAdvertAutoSelect.MyAdvertAutoSelectDialog f308555a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CloseReason f308556b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f308557c;

        public a(@Y61.k MyAdvertAutoSelect.MyAdvertAutoSelectDialog myAdvertAutoSelectDialog, @Y61.k CloseReason closeReason, @l String str) {
            super(null);
            this.f308555a = myAdvertAutoSelectDialog;
            this.f308556b = closeReason;
            this.f308557c = str;
        }
    }

    public /* synthetic */ i(C42822w c42822w) {
        this();
    }

    public i() {
    }
}
