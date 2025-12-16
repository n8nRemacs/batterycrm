package com.avito.android.messenger_icebreakers_dialog.di;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerBottomSheetData;
import com.avito.android.messenger_icebreakers_dialog.view.MessengerIcebreakerBottomSheetFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: MessengerIcebreakerBottomSheetComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/di/b;", "", "a", "b", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: MessengerIcebreakerBottomSheetComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/di/b$a;", "Lcom/avito/android/di/h;", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends InterfaceC29971h {
        @k
        InterfaceC28373a a();

        @k
        InterfaceC28481c b();
    }

    /* compiled from: MessengerIcebreakerBottomSheetComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/di/b$b;", "", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger_icebreakers_dialog.di.b$b, reason: collision with other inner class name */
    public interface InterfaceC5822b {
        @k
        b a(@h31.b @k MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment, @h31.b @k r rVar, @h31.b @k MessengerIcebreakerBottomSheetData messengerIcebreakerBottomSheetData, @k a aVar);
    }

    void a(@k MessengerIcebreakerBottomSheetFragment messengerIcebreakerBottomSheetFragment);
}
