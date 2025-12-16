package com.avito.android.publish.edit_advert_request_mvi;

import com.avito.android.remote.model.publish.EditAdvertResult;
import ee0.InterfaceC40095b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/f;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface f {
    @Y61.l
    Object a(@Y61.k EditAdvertResult.Ok ok2, @Y61.k String str, @Y61.k InterfaceC43172j interfaceC43172j, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    InterfaceC43160i<InterfaceC40095b> edit();
}
