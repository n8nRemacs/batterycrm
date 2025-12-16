package ru.cyberity.cbr.core.presentation.intro;

import Y61.k;
import java.util.Arrays;
import kotlin.Metadata;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: CBRIntroResource.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "Lru/cyberity/cbr/core/presentation/intro/CBRStepInfo;", "stepInfo", "Lru/cyberity/cbr/core/presentation/intro/Label;", "label", "", "getLabelResource", "step", "scene", "documentType", "formatInstructionsResourceId", "strings", "Lru/cyberity/cbr/core/presentation/intro/CBRIntroScreenInfo;", "buildIntroScreenInfo", "buildStatusScreenInfo", "field", "formatStatusResourceId", "cyberity-mobile-sdk-ui_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRIntroResourceKt {
    @k
    public static final CBRIntroScreenInfo buildIntroScreenInfo(@k CBRStepInfo cBRStepInfo, @k c.C12476c c12476c) {
        String labelResource = getLabelResource(c12476c, cBRStepInfo, Label.action_continue);
        String labelResource2 = getLabelResource(c12476c, cBRStepInfo, Label.title);
        String labelResource3 = getLabelResource(c12476c, cBRStepInfo, Label.subtitle);
        String labelResource4 = getLabelResource(c12476c, cBRStepInfo, Label.header);
        if (labelResource4.length() <= 0 || getLabelResource(c12476c, cBRStepInfo, Label.doHeader).length() != 0 || getLabelResource(c12476c, cBRStepInfo, Label.dontHeader).length() != 0) {
            labelResource4 = null;
        }
        CBRIntroItem cBRIntroItem = labelResource4 != null ? new CBRIntroItem(labelResource4, getLabelResource(c12476c, cBRStepInfo, Label.text), getLabelResource(c12476c, cBRStepInfo, Label.image)) : null;
        String labelResource5 = getLabelResource(c12476c, cBRStepInfo, Label.doHeader);
        if (labelResource5.length() <= 0) {
            labelResource5 = null;
        }
        CBRIntroItem cBRIntroItem2 = labelResource5 != null ? new CBRIntroItem(labelResource5, getLabelResource(c12476c, cBRStepInfo, Label.doText), getLabelResource(c12476c, cBRStepInfo, Label.doImage)) : null;
        String labelResource6 = getLabelResource(c12476c, cBRStepInfo, Label.dontHeader);
        if (labelResource6.length() <= 0) {
            labelResource6 = null;
        }
        return new CBRIntroScreenInfo(labelResource2, labelResource3, cBRIntroItem, cBRIntroItem2, labelResource6 != null ? new CBRIntroItem(labelResource6, getLabelResource(c12476c, cBRStepInfo, Label.dontText), getLabelResource(c12476c, cBRStepInfo, Label.dontImage)) : null, null, null, null, labelResource);
    }

    @k
    public static final CBRIntroScreenInfo buildStatusScreenInfo(@k CBRStepInfo cBRStepInfo, @k c.C12476c c12476c) {
        return new CBRIntroScreenInfo(buildStatusScreenInfo$fieldResource("title", c12476c, cBRStepInfo), buildStatusScreenInfo$fieldResource("subtitle", c12476c, cBRStepInfo), null, null, null, buildStatusScreenInfo$fieldResource("header_image", c12476c, cBRStepInfo), buildStatusScreenInfo$fieldResource("header_title", c12476c, cBRStepInfo), buildStatusScreenInfo$fieldResource("instructions_text", c12476c, cBRStepInfo), buildStatusScreenInfo$fieldResource("action_continue", c12476c, cBRStepInfo));
    }

    private static final String buildStatusScreenInfo$fieldResource(String str, c.C12476c c12476c, CBRStepInfo cBRStepInfo) {
        return c12476c.a(formatStatusResourceId(cBRStepInfo.getStep(), str));
    }

    private static final String formatInstructionsResourceId(String str, String str2, Label label, String str3) {
        String strConcat;
        String str4 = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, "instructions", label.name()}, 4));
        if (str3.length() <= 0) {
            str3 = null;
        }
        if (str3 == null || (strConcat = "::".concat(str3)) == null) {
            strConcat = "";
        }
        return str4.concat(strConcat);
    }

    private static final String formatStatusResourceId(String str, String str2) {
        return String.format("sns_status_%s_%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    private static final String getLabelResource(c.C12476c c12476c, CBRStepInfo cBRStepInfo, Label label) {
        String step = cBRStepInfo.getStep();
        String scene = cBRStepInfo.getScene();
        String documentType = cBRStepInfo.getDocumentType();
        if (documentType == null) {
            documentType = "";
        }
        return c12476c.a(formatInstructionsResourceId(step, scene, label, documentType), formatInstructionsResourceId(cBRStepInfo.getStep(), cBRStepInfo.getScene(), label, ""), formatInstructionsResourceId("defaults", cBRStepInfo.getScene(), label, ""));
    }
}
