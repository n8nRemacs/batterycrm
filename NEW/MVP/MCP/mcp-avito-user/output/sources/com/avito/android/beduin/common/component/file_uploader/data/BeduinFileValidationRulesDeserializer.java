package com.avito.android.beduin.common.component.file_uploader.data;

import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinFileValidationRulesDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/data/BeduinFileValidationRulesDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinFileValidationRulesDeserializer implements com.google.gson.h<ValidationRule> {

    /* compiled from: BeduinFileValidationRulesDeserializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/data/BeduinFileValidationRulesDeserializer$a;", "", "<init>", "()V", "", "MESSAGE_KEY", "Ljava/lang/String;", "TYPE_KEY", "VALUE_KEY", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.gson.h
    public final ValidationRule deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("errorMessage").s();
        String strS2 = kVarI.D("type").s();
        if (strS2 != null) {
            switch (strS2.hashCode()) {
                case -1326284707:
                    if (strS2.equals("fileTypes")) {
                        ArrayList arrayList = kVarI.D("value").h().f362000b;
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(gVar.b((com.google.gson.i) it.next(), String.class));
                        }
                        return new ValidationRule.FileTypesRule(strS, arrayList2);
                    }
                    break;
                case -972563254:
                    if (strS2.equals(ValidationRule.MIN_FILES_COUNT_RULE)) {
                        return new ValidationRule.MinFilesCountRule(strS, kVarI.D("value").g());
                    }
                    break;
                case 1296732449:
                    if (strS2.equals(ValidationRule.MAX_FILE_SIZE_RULE)) {
                        return new ValidationRule.MaxFileSizeRule(strS, kVarI.D("value").g());
                    }
                    break;
                case 1500097884:
                    if (strS2.equals(ValidationRule.MAX_FILES_COUNT_RULE)) {
                        return new ValidationRule.MaxFilesCountRule(strS, kVarI.D("value").g());
                    }
                    break;
            }
        }
        return null;
    }
}
