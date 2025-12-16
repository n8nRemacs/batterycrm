package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DisplayingOptionsDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/DisplayingOptionsDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisplayingOptionsDeserializer implements com.google.gson.h<DisplayingOptions> {
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bb  */
    @Override // com.google.gson.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.category_parameters.DisplayingOptions deserialize(com.google.gson.i r53, java.lang.reflect.Type r54, com.google.gson.g r55) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.DisplayingOptionsDeserializer.deserialize(com.google.gson.i, java.lang.reflect.Type, com.google.gson.g):java.lang.Object");
    }
}
