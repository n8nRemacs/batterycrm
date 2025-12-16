package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SortDirection;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: DisplayingSelectParameterDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DisplayingSelectParameterDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisplayingSelectParameterDeserializer implements com.google.gson.h<SelectParameter.Displaying> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254173a = P0.g(new kotlin.Q("acs", SortDirection.Ascending), new kotlin.Q("desc", SortDirection.Descending));

    /* JADX WARN: Can't wrap try/catch for region: R(86:0|2|(1:4)(1:5)|(1:7)|8|(1:10)(1:11)|12|(1:14)(1:15)|16|(1:18)(1:19)|20|(1:22)(1:23)|24|(1:26)(1:27)|28|(1:30)(1:31)|32|(1:34)(1:35)|36|(1:38)|39|(1:41)(2:43|(1:45)(64:46|47|(1:49)(1:50)|51|(1:53)(1:54)|55|(1:57)(1:58)|59|(1:61)(1:62)|187|63|64|81|(1:83)(1:84)|85|(1:87)(1:88)|89|(1:91)(1:92)|93|(1:95)(1:96)|97|(1:99)(1:100)|101|(1:103)(1:104)|105|(1:107)(1:108)|109|(1:111)(1:112)|113|(4:115|(2:118|116)|189|119)(1:120)|121|(1:123)(1:124)|125|(1:127)(1:128)|129|(1:131)(1:132)|133|(1:135)(1:136)|137|(1:139)(1:140)|141|(1:143)(1:144)|145|(1:147)(1:148)|149|(1:151)(1:152)|153|(1:155)(1:156)|157|(1:159)(1:160)|161|(1:163)(1:164)|165|(1:167)(1:168)|169|(1:171)(1:172)|173|(1:175)(1:176)|177|(1:179)(1:180)|181|(1:183)(1:184)|185|186))|42|47|(0)(0)|51|(0)(0)|55|(0)(0)|59|(0)(0)|187|63|64|81|(0)(0)|85|(0)(0)|89|(0)(0)|93|(0)(0)|97|(0)(0)|101|(0)(0)|105|(0)(0)|109|(0)(0)|113|(0)(0)|121|(0)(0)|125|(0)(0)|129|(0)(0)|133|(0)(0)|137|(0)(0)|141|(0)(0)|145|(0)(0)|149|(0)(0)|153|(0)(0)|157|(0)(0)|161|(0)(0)|165|(0)(0)|169|(0)(0)|173|(0)(0)|177|(0)(0)|181|(0)(0)|185|186) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0104, code lost:
    
        r8 = r1.D("titleTipAction");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        if (r8 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010e, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0110, code lost:
    
        r8 = r53.b(r8, com.avito.android.deep_linking.links.DeepLink.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
    
        r8 = (com.avito.android.deep_linking.links.DeepLink) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0118, code lost:
    
        r10 = new com.avito.android.remote.model.category_parameters.TipIconParameters(r8, com.avito.android.remote.model.category_parameters.TipIconParameters.Position.TITLE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        r3 = r1.D("containerTitleTipAction");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0126, code lost:
    
        if (r3 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0128, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        r3 = r53.b(r3, com.avito.android.deep_linking.links.DeepLink.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012e, code lost:
    
        r3 = (com.avito.android.deep_linking.links.DeepLink) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0130, code lost:
    
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0132, code lost:
    
        r10 = new com.avito.android.remote.model.category_parameters.TipIconParameters(r3, com.avito.android.remote.model.category_parameters.TipIconParameters.Position.TITLE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013b, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018e  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.category_parameters.SelectParameter.Displaying deserialize(com.google.gson.i r51, java.lang.reflect.Type r52, com.google.gson.g r53) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.DisplayingSelectParameterDeserializer.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }
}
