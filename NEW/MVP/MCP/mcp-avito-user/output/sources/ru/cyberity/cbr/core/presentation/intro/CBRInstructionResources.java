package ru.cyberity.cbr.core.presentation.intro;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: CBRInstructionResources.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/presentation/intro/CBRInstructionResources;", "", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "", "", "sdkDict", "verificationStep", "idDocumentType", "scene", "", "isStatusScreen", "<init>", "(Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDefinition", "()Ljava/util/Map;", "hasResources", "()Z", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "Ljava/util/Map;", "Ljava/lang/String;", "", "definition", "getInstructions", "instructions", "getActionTitle", "()Ljava/lang/String;", "actionTitle", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRInstructionResources {

    @k
    private final Map<String, Object> definition;

    @k
    private final String scene;

    @l
    private final Map<String, Object> sdkDict;

    @k
    private final c.C12476c strings;

    @k
    private final String verificationStep;

    public CBRInstructionResources(@k c.C12476c c12476c, @l Map<String, ? extends Object> map, @k String str, @l String str2, @k String str3, boolean z12) {
        this.strings = c12476c;
        this.sdkDict = map;
        this.verificationStep = str;
        this.scene = str3;
        Map<String, Object> definition = getDefinition();
        LinkedHashMap linkedHashMap = definition != null ? new LinkedHashMap(definition) : new LinkedHashMap();
        this.definition = linkedHashMap;
        CBRStepInfo cBRStepInfo = new CBRStepInfo(str, str3, str2);
        CBRIntroScreenInfo cBRIntroScreenInfoBuildStatusScreenInfo = z12 ? CBRIntroResourceKt.buildStatusScreenInfo(cBRStepInfo, c12476c) : CBRIntroResourceKt.buildIntroScreenInfo(cBRStepInfo, c12476c);
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            CBRIntroItem singleIntro = cBRIntroScreenInfoBuildStatusScreenInfo.getSingleIntro();
            if (singleIntro != null) {
                arrayList.add(P0.g(new Q("type", "single"), new Q("image", singleIntro.getIconKey()), new Q("header", singleIntro.getTitle()), new Q("text", singleIntro.getSubTitle())));
            }
            CBRIntroItem doIntro = cBRIntroScreenInfoBuildStatusScreenInfo.getDoIntro();
            if (doIntro != null) {
                arrayList.add(P0.g(new Q("type", "do"), new Q("image", doIntro.getIconKey()), new Q("header", doIntro.getTitle()), new Q("text", doIntro.getSubTitle())));
            }
            CBRIntroItem doNotIntro = cBRIntroScreenInfoBuildStatusScreenInfo.getDoNotIntro();
            if (doNotIntro != null) {
                arrayList.add(P0.g(new Q("type", "dont"), new Q("image", doNotIntro.getIconKey()), new Q("header", doNotIntro.getTitle()), new Q("text", doNotIntro.getSubTitle())));
            }
            String image = cBRIntroScreenInfoBuildStatusScreenInfo.getImage();
            if (image != null) {
                arrayList.add(P0.g(new Q("type", "image"), new Q("image", image)));
            }
            String header = cBRIntroScreenInfoBuildStatusScreenInfo.getHeader();
            if (header != null) {
                arrayList.add(P0.g(new Q("type", "header"), new Q("header", header)));
            }
            String text = cBRIntroScreenInfoBuildStatusScreenInfo.getText();
            if (text != null) {
                arrayList.add(P0.g(new Q("type", "text"), new Q("text", text)));
            }
            linkedHashMap.put("contentBlocks", arrayList);
        }
        if ((!linkedHashMap.containsKey("title") || z12) && cBRIntroScreenInfoBuildStatusScreenInfo.getTitle() != null) {
            linkedHashMap.put("title", cBRIntroScreenInfoBuildStatusScreenInfo.getTitle());
        }
        if ((!linkedHashMap.containsKey("subtitle") || z12) && cBRIntroScreenInfoBuildStatusScreenInfo.getSubTitle() != null) {
            linkedHashMap.put("subtitle", cBRIntroScreenInfoBuildStatusScreenInfo.getSubTitle());
        }
        if ((!linkedHashMap.containsKey("actionTitle") || z12) && cBRIntroScreenInfoBuildStatusScreenInfo.getButtonText() != null) {
            linkedHashMap.put("actionTitle", cBRIntroScreenInfoBuildStatusScreenInfo.getButtonText());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.util.Map<java.lang.String, java.lang.Object>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> getDefinition() {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            ru.cyberity.cbr.core.data.source.dynamic.c$c r2 = r9.strings
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "sns_step_"
            r3.<init>(r4)
            java.lang.String r4 = r9.verificationStep
            r3.append(r4)
            r4 = 95
            r3.append(r4)
            java.lang.String r4 = r9.scene
            r3.append(r4)
            java.lang.String r4 = "_instructions_definitionKey"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r2 = r2.a(r3)
            r3 = 0
            if (r2 == 0) goto Lc9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r9.sdkDict
            if (r4 == 0) goto Lc9
            char[] r5 = new char[r1]
            r6 = 46
            r5[r0] = r6
            java.util.List r2 = kotlin.text.C43066x.e0(r2, r5)
            kotlin.jvm.internal.l0$h r5 = new kotlin.jvm.internal.l0$h
            r5.<init>()
            r5.f406842b = r4
            int r4 = r2.size()
            int r4 = r4 - r1
            kotlin.ranges.l r0 = kotlin.ranges.s.r(r0, r4)
            kotlin.ranges.k r0 = r0.iterator()
        L4c:
            boolean r1 = r0.f406910d
            if (r1 == 0) goto Lae
            int r1 = r0.a()
            T r4 = r5.f406842b
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r1 = r2.get(r1)
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof java.util.Map
            if (r4 == 0) goto L67
            java.util.Map r1 = (java.util.Map) r1
            goto L68
        L67:
            r1 = r3
        L68:
            if (r1 == 0) goto Lc9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L77:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r8 = r7 instanceof java.lang.String
            if (r8 != 0) goto L8c
            r7 = r3
        L8c:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L91
            goto L9a
        L91:
            java.lang.Object r6 = r6.getValue()
            if (r6 != 0) goto L98
            r6 = r3
        L98:
            if (r6 != 0) goto L9c
        L9a:
            r8 = r3
            goto La1
        L9c:
            kotlin.Q r8 = new kotlin.Q
            r8.<init>(r7, r6)
        La1:
            if (r8 == 0) goto L77
            r4.add(r8)
            goto L77
        La7:
            java.util.Map r1 = kotlin.collections.P0.p(r4)
            r5.f406842b = r1
            goto L4c
        Lae:
            T r0 = r5.f406842b
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = kotlin.collections.C42745f0.S(r2)
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto Lc7
            boolean r1 = r0 instanceof Z41.a
            if (r1 == 0) goto Lc6
            boolean r1 = r0 instanceof Z41.g
            if (r1 == 0) goto Lc7
        Lc6:
            r3 = r0
        Lc7:
            java.util.Map r3 = (java.util.Map) r3
        Lc9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.intro.CBRInstructionResources.getDefinition():java.util.Map");
    }

    @l
    public final String getActionTitle() {
        Object obj = getInstructions().get("actionTitle");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @k
    public final Map<String, Object> getInstructions() {
        return this.definition;
    }

    public final boolean hasResources() {
        if (n0.f432787a.getInstructionsViewHandler() == null) {
            Object obj = this.definition.get("title");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || C43066x.K(str)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ CBRInstructionResources(c.C12476c c12476c, Map map, String str, String str2, String str3, boolean z12, int i12, C42822w c42822w) {
        this(c12476c, map, str, str2, str3, (i12 & 32) != 0 ? false : z12);
    }
}
