package ru.cyberity.cbr.core.presentation.helper.camera;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.analytics.GlobalStatePayload;
import ru.cyberity.cbr.core.analytics.b;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.helper.camera.CBRHelperViewState;
import ru.cyberity.cbr.core.presentation.intro.CBRStepInfo;

/* compiled from: CBRCameraHelperStateFactory.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/camera/CBRCameraHelperStateFactory;", "", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "Lru/cyberity/cbr/core/data/model/DocumentType;", "type", "Lru/cyberity/cbr/core/data/model/g$c$a;", "docSetItem", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "", "countryCode", "", "Lru/cyberity/cbr/core/data/model/r;", "identityList", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "side", "Lru/cyberity/cbr/core/presentation/helper/camera/CBRHelperViewState;", "prepareBriefDetails", "<init>", "()V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRCameraHelperStateFactory {

    @k
    public static final CBRCameraHelperStateFactory INSTANCE = new CBRCameraHelperStateFactory();

    /* compiled from: CBRCameraHelperStateFactory.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentitySide.values().length];
            iArr[IdentitySide.Front.ordinal()] = 1;
            iArr[IdentitySide.Back.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CBRCameraHelperStateFactory() {
    }

    @k
    public final CBRHelperViewState prepareBriefDetails(@k c.C12476c strings, @k DocumentType type, @l g.c.a docSetItem, @k CBRStepInfo stepInfo, @l String countryCode, @k List<? extends r> identityList, @l IdentitySide side) {
        String value;
        if (!type.k()) {
            r rVar = identityList.size() == 1 ? (r) C42745f0.E(identityList) : null;
            if (side != null && (value = side.getValue()) != null) {
                b.f432519a.a(GlobalStatePayload.IdDocSubType, value);
                G0 g02 = G0.f406611a;
            }
            int i12 = side == null ? -1 : WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    return CBRHelperViewState.InvalidValue.INSTANCE;
                }
                u0 u0Var = u0.f406856a;
                return new CBRHelperViewState.BriefDetails(strings.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "backSide", "title", rVar != null ? rVar.getValue() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "backSide", "title"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "backSide", "title"}, 4))), strings.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "backSide", "brief", rVar != null ? rVar.getValue() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "backSide", "brief"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "backSide", "brief"}, 4))), strings.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "backSide", "details", rVar != null ? rVar.getValue() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "backSide", "details"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "backSide", "details"}, 4))), stepInfo, countryCode);
            }
            String strA = strings.a("sns_iddoc_listing_join");
            String strO = C42745f0.O(identityList, strA == null ? "" : strA, null, null, new CBRCameraHelperStateFactory$prepareBriefDetails$briefList$1(strings), 30);
            String strA2 = strings.a("sns_iddoc_listing_join_details");
            String strO2 = C42745f0.O(identityList, strA2 == null ? "" : strA2, null, null, new CBRCameraHelperStateFactory$prepareBriefDetails$detailsList$1(strings), 30);
            u0 u0Var2 = u0.f406856a;
            return new CBRHelperViewState.BriefDetails(strings.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "frontSide", "title", rVar != null ? rVar.getValue() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "frontSide", "title"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "frontSide", "title"}, 4))), String.format(C43066x.a0(strings.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "frontSide", "brief", rVar != null ? rVar.getValue() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "frontSide", "brief"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "frontSide", "brief"}, 4))), "{doctypes}", "%s", false), Arrays.copyOf(new Object[]{strO}, 1)), String.format(C43066x.a0(strings.a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "frontSide", "details", rVar != null ? rVar.getValue() : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{type.getValue(), "scan", "frontSide", "details"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{"defaults", "scan", "frontSide", "details"}, 4))), "{doctypes}", "%s", false), Arrays.copyOf(new Object[]{strO2}, 1)), stepInfo, countryCode);
        }
        String str = (docSetItem == null || !docSetItem.u()) ? "photo" : "portrait";
        String strA3 = strings.a("sns_step_" + type.getValue() + '_' + str + "_title");
        String str2 = strA3 == null ? "" : strA3;
        String strA4 = strings.a("sns_step_" + type.getValue() + '_' + str + "_brief");
        String str3 = strA4 == null ? "" : strA4;
        String strA5 = strings.a("sns_step_" + type.getValue() + '_' + str + "_details");
        if (strA5 == null) {
            strA5 = "";
        }
        return new CBRHelperViewState.BriefDetails(str2, str3, strA5, stepInfo, countryCode);
    }
}
