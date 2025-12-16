package com.avito.android.auth_passwordless.links;

import com.avito.android.auth_passwordless.AuthPasswordlessEntryLink;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuthPasswordlessEntryDeeplinkFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auth_passwordless/links/i;", "Lcom/avito/android/auth_passwordless/links/h;", "<init>", "()V", "a", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements h {

    /* compiled from: AuthPasswordlessEntryDeeplinkFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/auth_passwordless/links/i$a;", "", "<init>", "()V", "", "PAGE_PATH", "Ljava/lang/String;", "SCREEN_NAME", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i() {
    }

    @Override // com.avito.android.auth_passwordless.links.h
    @Y61.k
    public final BeduinV2BottomSheetDeepLink a(@Y61.k AuthPasswordlessEntryLink authPasswordlessEntryLink) {
        return new BeduinV2BottomSheetDeepLink("api/1/global/login?entry=" + authPasswordlessEntryLink.f92625b, "passwordless_entry_bottom_sheet_content", "fit", false, null, null, null, null, false, 496, null);
    }
}
