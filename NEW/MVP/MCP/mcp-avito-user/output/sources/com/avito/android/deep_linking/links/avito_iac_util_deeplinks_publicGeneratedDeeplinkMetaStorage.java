package com.avito.android.deep_linking.links;

import Iu.C14159a;
import androidx.annotation.Keep;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.iac_util_deeplinks.public_module.ClickStreamLocalLink;
import com.avito.android.iac_util_deeplinks.public_module.IgnoreInDialogRouterLink;
import com.avito.android.iac_util_deeplinks.public_module.OpenSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionCheckLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemSettingsLink;
import com.avito.android.iac_util_deeplinks.public_module.RunMultipleLink;
import com.avito.android.iac_util_deeplinks.public_module.SetFlowResultLink;
import com.avito.android.iac_util_deeplinks.public_module.checkable_test_link.IacCheckableTestLink;
import com.avito.android.iac_util_deeplinks.public_module.control_flow.RunExecutableArgsLink;
import com.avito.android.iac_util_deeplinks.public_module.control_flow.SetExecutableArgsLink;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestAppSettingsWithReturnLink;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestCheckLink;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink;
import com.avito.android.iac_util_deeplinks.public_module.run_once.RunOnceLink;
import com.avito.android.region.Region;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;

/* compiled from: avito_iac_util_deeplinks_publicGeneratedDeeplinkMetaStorage.kt */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/avito_iac_util_deeplinks_publicGeneratedDeeplinkMetaStorage;", "Lcom/avito/android/deep_linking/links/GeneratedDeepLinkMetaStorage;", "<init>", "()V", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/avito/android/deep_linking/links/p;", "LIu/a;", GeneratedDeepLinkMetaStorage.PROPERTY, "Ljava/util/HashMap;", "getClassesToMetaInfo", "()Ljava/util/HashMap;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class avito_iac_util_deeplinks_publicGeneratedDeeplinkMetaStorage implements GeneratedDeepLinkMetaStorage {

    @Y61.k
    private final HashMap<Class<? extends p>, C14159a> classesToMetaInfo;

    public avito_iac_util_deeplinks_publicGeneratedDeeplinkMetaStorage() {
        Region region = Region.f252702c;
        Region region2 = Region.f252703d;
        this.classesToMetaInfo = P0.e(new Q(ChainEventLink.class, new C14159a(1, "/local/linkChainEvent", C42756l.l0(new Region[]{region, region2}), false)), new Q(ClickStreamLocalLink.class, new C14159a(1, "/clickstream/local", C42756l.l0(new Region[]{region, region2}), false)), new Q(IgnoreInDialogRouterLink.class, new C14159a(1, "/ignoreInDialogRouter", C42756l.l0(new Region[]{region, region2}), false)), new Q(OpenSystemSettingsLink.class, new C14159a(1, "/system/openSystemSettings", C42756l.l0(new Region[]{region, region2}), false)), new Q(PermissionCheckLink.class, new C14159a(1, "/permissions/check", C42756l.l0(new Region[]{region, region2}), false)), new Q(PermissionSystemRequestLink.class, new C14159a(1, "/permissions/systemRequest", C42756l.l0(new Region[]{region, region2}), false)), new Q(PermissionSystemSettingsLink.class, new C14159a(1, "/permissions/systemSettings", C42756l.l0(new Region[]{region, region2}), false)), new Q(RunMultipleLink.class, new C14159a(1, "/runMultiple", C42756l.l0(new Region[]{region, region2}), false)), new Q(SetFlowResultLink.class, new C14159a(1, "/local/setFlowResult", C42756l.l0(new Region[]{region, region2}), false)), new Q(IacCheckableTestLink.class, new C14159a(1, "/test/iac/checkableTestLink", C42756l.l0(new Region[]{region, region2}), false)), new Q(RunExecutableArgsLink.class, new C14159a(1, "/controlFlow/runExecutableArgs", C42756l.l0(new Region[]{region, region2}), false)), new Q(SetExecutableArgsLink.class, new C14159a(1, "/controlFlow/setExecutableArgs", C42756l.l0(new Region[]{region, region2}), false)), new Q(PermissionRequestAppSettingsWithReturnLink.class, new C14159a(1, "/calls/permissionRequest/appSettingsWithReturn", C42756l.l0(new Region[]{region, region2}), false)), new Q(PermissionRequestCheckLink.class, new C14159a(1, "/calls/permissionRequest/check", C42756l.l0(new Region[]{region, region2}), false)), new Q(PermissionRequestSystemPopupLink.class, new C14159a(1, "/calls/permissionRequest/systemPopup", C42756l.l0(new Region[]{region, region2}), false)), new Q(ReplaceContactLink.class, new C14159a(1, "/calls/replaceContact", C42756l.l0(new Region[]{region, region2}), false)), new Q(RunOnceLink.class, new C14159a(1, "/runOnce", C42756l.l0(new Region[]{region, region2}), false)));
    }

    @Override // com.avito.android.deep_linking.links.GeneratedDeepLinkMetaStorage
    @Y61.k
    public HashMap<Class<? extends p>, C14159a> getClassesToMetaInfo() {
        return this.classesToMetaInfo;
    }
}
