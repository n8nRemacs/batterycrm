package com.avito.android.beduin.common.actionhandler;

import com.avito.android.beduin.common.action.BeduinDebounceAction;
import kotlin.Metadata;

/* compiled from: BeduinDebounceActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin/common/action/BeduinDebounceAction;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C<T, R> f100054b = new C<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        String id2 = ((BeduinDebounceAction) obj).getId();
        return id2 == null ? "" : id2;
    }
}
