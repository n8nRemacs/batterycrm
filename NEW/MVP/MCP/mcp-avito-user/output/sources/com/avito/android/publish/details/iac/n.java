package com.avito.android.publish.details.iac;

import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.publish.details.iac.l;
import java.util.List;
import kotlin.Metadata;
import l41.r;

/* compiled from: IacPermissionRequestHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chainEventLink", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class n<T> implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final n<T> f234768b = new n<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        l.a.f234748a.getClass();
        return ((List) l.a.f234757j.getValue()).contains((ChainEventLink) obj);
    }
}
