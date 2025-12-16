package com.avito.android.support_bottom_sheet.di;

import Y61.k;
import Y61.l;
import com.avito.android.di.B;
import com.avito.android.support_bottom_sheet.ui.SupportDialogFragment;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: SupportDialogComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/support_bottom_sheet/di/b;", "", "a", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: SupportDialogComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/support_bottom_sheet/di/b$a;", "", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k d dVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k @Named("CHAT_BUTTON_TITLE") String str, @h31.b @l @Named("CHAT_BUTTON_SUBTITLE") String str2, @h31.b @k @Named("CALL_BUTTON_TITLE") String str3, @h31.b @l @Named("CALL_BUTTON_SUBTITLE") String str4, @h31.b @k @Named("PHONE") String str5, @h31.b @k @Named("SCREEN_TAG") String str6, @h31.b @l @Named("SLOT_ID") Long l12, @h31.b @k @Named("ON_CHAT_CLICK_LISTENER") Y41.a aVar, @h31.b @k @Named("ON_CALL_CLICK_LISTENER") Y41.a aVar2);
    }

    void a(@k SupportDialogFragment supportDialogFragment);
}
