package com.avito.android.upload_doc.di;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.di.B;
import com.avito.android.upload_doc.lifecycle.GigUploadDocFragment;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: GigUploadDocComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/upload_doc/di/b;", "", "a", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: GigUploadDocComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/di/b$a;", "", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k d dVar, @k InterfaceC39417a interfaceC39417a, @h31.b @k C28478k c28478k, @h31.b @k Resources resources, @h31.b @k p pVar, @h31.b @k GigUploadDocDeeplink.FlowType flowType, @h31.b @k @Named("ADD_DOC_CLICK") l lVar, @h31.b @k @Named("DELETE_DOC_CLICK") l lVar2, @h31.b @k @Named("RETRY_DOC_CLICK") l lVar3);
    }

    void a(@k GigUploadDocFragment gigUploadDocFragment);
}
