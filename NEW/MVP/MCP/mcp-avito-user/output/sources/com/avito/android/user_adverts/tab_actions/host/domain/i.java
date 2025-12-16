package com.avito.android.user_adverts.tab_actions.host.domain;

import com.avito.android.remote.user_adverts_actions.generated.api.api_profile_item_available_actions.PostAvailableActionsSuccessActionsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsAvailableActionsMapperV1.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-adverts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    /* compiled from: UserAdvertsAvailableActionsMapperV1.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f314258a;

        static {
            int[] iArr = new int[PostAvailableActionsSuccessActionsItem.Type.values().length];
            try {
                iArr[PostAvailableActionsSuccessActionsItem.Type.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostAvailableActionsSuccessActionsItem.Type.Danger.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f314258a = iArr;
        }
    }
}
