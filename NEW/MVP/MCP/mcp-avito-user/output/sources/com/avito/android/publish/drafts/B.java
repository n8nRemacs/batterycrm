package com.avito.android.publish.drafts;

import com.avito.android.remote.model.category_parameters.AttributeNode;
import kotlin.Metadata;

/* compiled from: PublishDraftRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/category_parameters/AttributeNode;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/AttributeNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<AttributeNode, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributeNode f235315l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(AttributeNode attributeNode) {
        super(1);
        this.f235315l = attributeNode;
    }

    @Override // Y41.l
    public final Boolean invoke(AttributeNode attributeNode) {
        return Boolean.valueOf(kotlin.jvm.internal.L.f(attributeNode.getId(), this.f235315l.getId()));
    }
}
