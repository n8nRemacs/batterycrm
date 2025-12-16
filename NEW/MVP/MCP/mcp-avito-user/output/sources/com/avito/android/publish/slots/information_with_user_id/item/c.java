package com.avito.android.publish.slots.information_with_user_id.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: InformationWithUserIdItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/information_with_user_id/item/c;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244339b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f244340c;

    public c(@k String str, @k AttributedText attributedText) {
        this.f244339b = str;
        this.f244340c = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF236933b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236933b() {
        return this.f244339b;
    }
}
