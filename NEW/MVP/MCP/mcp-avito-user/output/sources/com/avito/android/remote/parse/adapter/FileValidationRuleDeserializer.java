package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.category_parameters.FileUploadValidationRule;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FileValidationRuleDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/FileValidationRuleDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/category_parameters/FileUploadValidationRule;", "<init>", "()V", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FileValidationRuleDeserializer implements com.google.gson.h<FileUploadValidationRule> {

    /* compiled from: FileValidationRuleDeserializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/parse/adapter/FileValidationRuleDeserializer$a;", "", "<init>", "()V", "", "MESSAGE_KEY", "Ljava/lang/String;", "TYPE_KEY", "VALUE_KEY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.google.gson.h
    public final FileUploadValidationRule deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("message").s();
        String strS2 = kVarI.D("type").s();
        if (strS2 != null) {
            int iHashCode = strS2.hashCode();
            if (iHashCode != -1622501160) {
                if (iHashCode != -1326284707) {
                    if (iHashCode == 3530753 && strS2.equals("size")) {
                        return new FileUploadValidationRule.FileSizeRule(strS, kVarI.D("value").g());
                    }
                } else if (strS2.equals("fileTypes")) {
                    ArrayList arrayList = kVarI.D("value").h().f362000b;
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(gVar.b((com.google.gson.i) it.next(), String.class));
                    }
                    return new FileUploadValidationRule.FileTypesRule(strS, arrayList2);
                }
            } else if (strS2.equals(FileUploadValidationRule.FILES_COUNT_RULE)) {
                return new FileUploadValidationRule.FilesCountRule(strS, kVarI.D("value").g());
            }
        }
        return null;
    }
}
