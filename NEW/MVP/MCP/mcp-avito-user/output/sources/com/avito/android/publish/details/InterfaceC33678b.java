package com.avito.android.publish.details;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/b;", "LXd0/d;", "Lcom/avito/android/publish/items/video_upload/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33678b extends Xd0.d, com.avito.android.publish.items.video_upload.a {

    /* compiled from: PublishDetailsViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.b$a */
    public static final class a {
    }

    void B9(@Y61.k PublishDetailsFlowTracker.FlowContext... flowContextArr);

    @Y61.k
    List<com.avito.conveyor_item.a> Ha(@Y61.k UV0.a<ParameterSlot> aVar, @Y61.k PublishDetailsFlowTracker.FlowContext[] flowContextArr);

    void J5(@Y61.k JO.a aVar);

    void Mb(@Y61.k com.avito.conveyor_item.a aVar);

    void V8(@Y61.k String str);

    void e7();

    @Override // Xd0.d
    void l(@Y61.l String str);

    void v3(boolean z12);

    void x4(@Y61.k Set<String> set, @Y61.k Y41.l<? super Boolean, kotlin.G0> lVar);
}
