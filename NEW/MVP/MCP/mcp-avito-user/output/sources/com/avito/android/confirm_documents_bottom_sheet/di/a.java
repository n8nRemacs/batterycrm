package com.avito.android.confirm_documents_bottom_sheet.di;

import Y41.l;
import Y61.k;
import com.avito.android.confirm_documents_bottom_sheet.ui.ConfirmDocumentsDialogFragment;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: ConfirmDocumentsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/di/a;", "", "a", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: ConfirmDocumentsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/di/a$a;", "", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.confirm_documents_bottom_sheet.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3727a {
        @k
        a a(@h31.b @k l lVar, @h31.b @Y61.l @Named("FROM_PAGE") String str, @h31.b @Y61.l @Named("ITEM_ID") String str2, @h31.b @Y61.l @Named("SHIFT_ID") String str3, @h31.b @Y61.l @Named("SCREEN_NAME") String str4, @k c cVar, @k InterfaceC39417a interfaceC39417a);
    }

    void a(@k ConfirmDocumentsDialogFragment confirmDocumentsDialogFragment);
}
