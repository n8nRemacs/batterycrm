package com.avito.android.publish.network.module;

import com.avito.android.Q1;
import com.avito.android.S1;
import com.avito.android.remote.model.PublishAnonymousNumber;
import com.avito.android.remote.model.PublishStartInfo;
import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.FileUploadValidationRule;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.BaseSlot;
import com.avito.android.remote.model.category_parameters.slot.imv.MarketValueItem;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import com.avito.android.remote.parse.adapter.AttributeNodeDeserializer;
import com.avito.android.remote.parse.adapter.AttributeNodeSerializer;
import com.avito.android.remote.parse.adapter.C34381y;
import com.avito.android.remote.parse.adapter.CharParameterWidgetConfigDeserializer;
import com.avito.android.remote.parse.adapter.DisplayingOptionsDeserializer;
import com.avito.android.remote.parse.adapter.DisplayingSelectParameterDeserializer;
import com.avito.android.remote.parse.adapter.FileValidationRuleDeserializer;
import com.avito.android.remote.parse.adapter.InstantMarketValueItemDeserializer;
import com.avito.android.remote.parse.adapter.ProactiveModerationDuplicateDeserializer;
import com.avito.android.remote.parse.adapter.ProactiveModerationWrongCategoryDeserializer;
import com.avito.android.remote.parse.adapter.PublishAnonymousNumberDeserializer;
import com.avito.android.remote.parse.adapter.PublishStartInfoDeserializer;
import com.avito.android.remote.parse.adapter.SealedClassDeserializer;
import com.avito.android.remote.parse.adapter.SelectParameterWidgetConfigDeserializer;
import com.avito.android.remote.parse.adapter.SlotAdapter;
import com.avito.android.remote.parse.adapter.StsRecognitionDeserializer;
import com.avito.android.remote.parse.adapter.WizardParametersTypeAdapter;
import com.avito.android.util.X5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;

/* compiled from: PublishJsonModule_ProvideTypeAdaptersFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    public final S1 f237464a;

    public d(S1 s12) {
        this.f237464a = s12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Q1 q12 = (Q1) this.f237464a.get();
        a.f237461a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(AdvertProactiveModerationResult.WrongCategory.class, new ProactiveModerationWrongCategoryDeserializer()));
        linkedHashSet.add(new X5(AdvertProactiveModerationResult.Duplicate.class, new ProactiveModerationDuplicateDeserializer()));
        linkedHashSet.add(new X5(MarketValueItem.class, new InstantMarketValueItemDeserializer()));
        linkedHashSet.add(new X5(AttributeNode.class, new AttributeNodeDeserializer()));
        linkedHashSet.add(new X5(WizardParameter.class, new WizardParametersTypeAdapter()));
        linkedHashSet.add(new X5(AttributeNode.class, new AttributeNodeSerializer()));
        linkedHashSet.add(new X5(BaseSlot.class, new SlotAdapter(q12)));
        linkedHashSet.add(new X5(PublishAnonymousNumber.class, new PublishAnonymousNumberDeserializer()));
        linkedHashSet.add(new X5(PublishStartInfo.class, new PublishStartInfoDeserializer()));
        linkedHashSet.add(new X5(StsRecognitionResult.Ok.class, new StsRecognitionDeserializer()));
        linkedHashSet.add(new X5(DisplayingOptions.class, new DisplayingOptionsDeserializer()));
        linkedHashSet.add(new X5(SelectParameter.Displaying.class, new DisplayingSelectParameterDeserializer()));
        SealedClassDeserializer.f254229d.getClass();
        SealedClassDeserializer.a aVar = new SealedClassDeserializer.a();
        aVar.a("error");
        LinkedHashMap linkedHashMap = aVar.f254234b;
        n0 n0Var = m0.f406844a;
        linkedHashMap.put("error", n0Var.b(ImeiRecognitionResult.Error.class));
        aVar.a("success");
        linkedHashMap.put("success", n0Var.b(ImeiRecognitionResult.Success.class));
        linkedHashSet.add(new X5(ImeiRecognitionResult.class, aVar.b()));
        linkedHashSet.add(new X5(FileUploadValidationRule.class, new FileValidationRuleDeserializer()));
        linkedHashSet.add(new X5(FileUploadResult.class, C34381y.b()));
        linkedHashSet.add(new X5(FileDeleteResult.class, C34381y.a()));
        linkedHashSet.add(new X5(CharParameter.Widget.Config.class, new CharParameterWidgetConfigDeserializer()));
        linkedHashSet.add(new X5(SelectParameter.Widget.Config.class, new SelectParameterWidgetConfigDeserializer()));
        return linkedHashSet;
    }
}
