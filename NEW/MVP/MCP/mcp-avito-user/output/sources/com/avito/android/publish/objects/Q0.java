package com.avito.android.publish.objects;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DateTimeIntervalParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.DateTimeRangeParameter;
import com.avito.android.remote.model.category_parameters.DateTimeRangePoint;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiGeoParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SelectDeepLinkParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SubLocationParameter;
import com.avito.android.remote.model.category_parameters.VideoParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: ObjectsParameterHolder.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/Q0;", "Lcom/avito/android/publish/objects/P0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f237565a;

    @Inject
    public Q0(@Y61.k com.avito.android.publish.C0 c02) {
        this.f237565a = c02;
    }

    public static ArrayList c(List list) {
        ParameterSlot parameterSlotCopy;
        DateTimeRangeParameter.Widget widgetCopy;
        DateTimeRangeParameter.Widget.Config configCopy$default;
        DateTimeRangeParameter.Widget.Config config;
        if (list == null) {
            return null;
        }
        List<ParameterSlot> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (ParameterSlot parameterSlot : list2) {
            if (parameterSlot instanceof EditCategoryParameter) {
                parameterSlotCopy = EditCategoryParameter.copy$default((EditCategoryParameter) parameterSlot, null, null, null, 7, null);
            } else if (parameterSlot instanceof SelectParameter.Flat) {
                SelectParameter.Flat flat = (SelectParameter.Flat) parameterSlot;
                parameterSlotCopy = flat.copy((33554431 & 1) != 0 ? flat.id : null, (33554431 & 2) != 0 ? flat.title : null, (33554431 & 4) != 0 ? flat.subtitle : null, (33554431 & 8) != 0 ? flat.required : false, (33554431 & 16) != 0 ? flat.immutable : false, (33554431 & 32) != 0 ? flat.motivation : null, (33554431 & 64) != 0 ? flat.updatesForm : null, (33554431 & 128) != 0 ? flat.updatesObjectForm : null, (33554431 & 256) != 0 ? flat._value : null, (33554431 & 512) != 0 ? flat.chosenValue : null, (33554431 & 1024) != 0 ? flat._values : null, (33554431 & 2048) != 0 ? flat.displaying : null, (33554431 & 4096) != 0 ? flat.placeholder : null, (33554431 & 8192) != 0 ? flat.attributeId : null, (33554431 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? flat.availableOptions : null, (33554431 & 32768) != 0 ? flat.isEnabled : null, (33554431 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? flat.visible : null, (33554431 & 131072) != 0 ? flat.phantom : null, (33554431 & 262144) != 0 ? flat.resetValue : null, (33554431 & 524288) != 0 ? flat._hasSuggest : null, (33554431 & 1048576) != 0 ? flat.displayTitle : null, (33554431 & 2097152) != 0 ? flat.defaultValue : null, (33554431 & 4194304) != 0 ? flat.resetAreaOnChange : false, (33554431 & 8388608) != 0 ? flat.widget : null, (33554431 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? flat.constraints : null);
            } else if (parameterSlot instanceof LocationParameter) {
                LocationParameter locationParameter = (LocationParameter) parameterSlot;
                parameterSlotCopy = locationParameter.copy((511 & 1) != 0 ? locationParameter.id : null, (511 & 2) != 0 ? locationParameter.title : null, (511 & 4) != 0 ? locationParameter.motivation : null, (511 & 8) != 0 ? locationParameter.updatesForm : null, (511 & 16) != 0 ? locationParameter.required : false, (511 & 32) != 0 ? locationParameter._value : null, (511 & 64) != 0 ? locationParameter.visible : null, (511 & 128) != 0 ? locationParameter.phantom : null, (511 & 256) != 0 ? locationParameter.immutable : false);
            } else if (parameterSlot instanceof SubLocationParameter) {
                SubLocationParameter subLocationParameter = (SubLocationParameter) parameterSlot;
                parameterSlotCopy = subLocationParameter.copy((255 & 1) != 0 ? subLocationParameter.sublocationType : null, (255 & 2) != 0 ? subLocationParameter.title : null, (255 & 4) != 0 ? subLocationParameter.motivation : null, (255 & 8) != 0 ? subLocationParameter._value : null, (255 & 16) != 0 ? subLocationParameter.values : null, (255 & 32) != 0 ? subLocationParameter.visible : null, (255 & 64) != 0 ? subLocationParameter.phantom : null, (255 & 128) != 0 ? subLocationParameter.type : null);
            } else if (parameterSlot instanceof AddressParameter) {
                AddressParameter addressParameter = (AddressParameter) parameterSlot;
                parameterSlotCopy = addressParameter.copy((524287 & 1) != 0 ? addressParameter.id : null, (524287 & 2) != 0 ? addressParameter.title : null, (524287 & 4) != 0 ? addressParameter.required : false, (524287 & 8) != 0 ? addressParameter.immutable : false, (524287 & 16) != 0 ? addressParameter.motivation : null, (524287 & 32) != 0 ? addressParameter.updatesForm : null, (524287 & 64) != 0 ? addressParameter.suggestData : null, (524287 & 128) != 0 ? addressParameter._value : null, (524287 & 256) != 0 ? addressParameter.placeholder : null, (524287 & 512) != 0 ? addressParameter.isAddressesLoaded : null, (524287 & 1024) != 0 ? addressParameter.errorPlace : null, (524287 & 2048) != 0 ? addressParameter.displaying : null, (524287 & 4096) != 0 ? addressParameter.flowType : null, (524287 & 8192) != 0 ? addressParameter.validationRules : null, (524287 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? addressParameter.visible : null, (524287 & 32768) != 0 ? addressParameter.phantom : null, (524287 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? addressParameter.widget : null, (524287 & 131072) != 0 ? addressParameter.subtitle : null, (524287 & 262144) != 0 ? addressParameter.constraints : null);
            } else if (parameterSlot instanceof MultiGeoParameter) {
                MultiGeoParameter multiGeoParameter = (MultiGeoParameter) parameterSlot;
                parameterSlotCopy = multiGeoParameter.copy((255 & 1) != 0 ? multiGeoParameter.id : null, (255 & 2) != 0 ? multiGeoParameter.title : null, (255 & 4) != 0 ? multiGeoParameter.immutable : false, (255 & 8) != 0 ? multiGeoParameter.required : false, (255 & 16) != 0 ? multiGeoParameter.motivation : null, (255 & 32) != 0 ? multiGeoParameter.updatesForm : null, (255 & 64) != 0 ? multiGeoParameter._value : null, (255 & 128) != 0 ? multiGeoParameter.widget : null);
            } else if (parameterSlot instanceof QuartersParameter) {
                QuartersParameter quartersParameter = (QuartersParameter) parameterSlot;
                parameterSlotCopy = quartersParameter.copy((2047 & 1) != 0 ? quartersParameter.id : null, (2047 & 2) != 0 ? quartersParameter.attributeId : null, (2047 & 4) != 0 ? quartersParameter.title : null, (2047 & 8) != 0 ? quartersParameter.motivation : null, (2047 & 16) != 0 ? quartersParameter.updatesForm : null, (2047 & 32) != 0 ? quartersParameter._value : null, (2047 & 64) != 0 ? quartersParameter.values : null, (2047 & 128) != 0 ? quartersParameter.visible : null, (2047 & 256) != 0 ? quartersParameter.phantom : null, (2047 & 512) != 0 ? quartersParameter.displaying : null, (2047 & 1024) != 0 ? quartersParameter.resetAreaOnChange : false);
            } else if (parameterSlot instanceof RadiusParameter) {
                RadiusParameter radiusParameter = (RadiusParameter) parameterSlot;
                parameterSlotCopy = radiusParameter.copy((1023 & 1) != 0 ? radiusParameter.id : null, (1023 & 2) != 0 ? radiusParameter.title : null, (1023 & 4) != 0 ? radiusParameter.motivation : null, (1023 & 8) != 0 ? radiusParameter.updatesForm : null, (1023 & 16) != 0 ? radiusParameter.required : false, (1023 & 32) != 0 ? radiusParameter._value : null, (1023 & 64) != 0 ? radiusParameter.visible : null, (1023 & 128) != 0 ? radiusParameter.phantom : null, (1023 & 256) != 0 ? radiusParameter.values : null, (1023 & 512) != 0 ? radiusParameter.displayingOptions : null);
            } else if (parameterSlot instanceof SelectParameter.Sectioned) {
                SelectParameter.Sectioned sectioned = (SelectParameter.Sectioned) parameterSlot;
                parameterSlotCopy = sectioned.copy((1048575 & 1) != 0 ? sectioned.id : null, (1048575 & 2) != 0 ? sectioned.title : null, (1048575 & 4) != 0 ? sectioned.required : false, (1048575 & 8) != 0 ? sectioned.immutable : false, (1048575 & 16) != 0 ? sectioned.motivation : null, (1048575 & 32) != 0 ? sectioned.updatesForm : null, (1048575 & 64) != 0 ? sectioned.updatesObjectForm : null, (1048575 & 128) != 0 ? sectioned._value : null, (1048575 & 256) != 0 ? sectioned.chosenValue : null, (1048575 & 512) != 0 ? sectioned.sections : null, (1048575 & 1024) != 0 ? sectioned._displaying : null, (1048575 & 2048) != 0 ? sectioned.placeholder : null, (1048575 & 4096) != 0 ? sectioned.attributeId : null, (1048575 & 8192) != 0 ? sectioned.visible : null, (1048575 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? sectioned.phantom : null, (1048575 & 32768) != 0 ? sectioned.displayTitle : null, (1048575 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? sectioned.resetAreaOnChange : false, (1048575 & 131072) != 0 ? sectioned.widget : null, (1048575 & 262144) != 0 ? sectioned._hasSuggest : null, (1048575 & 524288) != 0 ? sectioned.constraints : null);
            } else if (parameterSlot instanceof MultiselectParameter) {
                MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlot;
                parameterSlotCopy = multiselectParameter.copy((4194175 & 1) != 0 ? multiselectParameter.id : null, (4194175 & 2) != 0 ? multiselectParameter.title : null, (4194175 & 4) != 0 ? multiselectParameter.required : false, (4194175 & 8) != 0 ? multiselectParameter.immutable : false, (4194175 & 16) != 0 ? multiselectParameter.motivation : null, (4194175 & 32) != 0 ? multiselectParameter.updatesForm : null, (4194175 & 64) != 0 ? multiselectParameter.updatesObjectForm : null, (4194175 & 128) != 0 ? multiselectParameter._value : null, (4194175 & 256) != 0 ? multiselectParameter.displaying : null, (4194175 & 512) != 0 ? multiselectParameter.values : null, (4194175 & 1024) != 0 ? multiselectParameter.selectedValues : null, (4194175 & 2048) != 0 ? multiselectParameter.placeholder : null, (4194175 & 4096) != 0 ? multiselectParameter.attributeId : null, (4194175 & 8192) != 0 ? multiselectParameter.maxSelected : null, (4194175 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? multiselectParameter.subtitle : null, (4194175 & 32768) != 0 ? multiselectParameter.availableOptions : null, (4194175 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? multiselectParameter.hint : null, (4194175 & 131072) != 0 ? multiselectParameter.visible : null, (4194175 & 262144) != 0 ? multiselectParameter.phantom : null, (4194175 & 524288) != 0 ? multiselectParameter.hasSuggest : null, (4194175 & 1048576) != 0 ? multiselectParameter.resetAreaOnChange : false, (4194175 & 2097152) != 0 ? multiselectParameter.constraints : null);
            } else if (parameterSlot instanceof CharParameter) {
                CharParameter charParameter = (CharParameter) parameterSlot;
                parameterSlotCopy = charParameter.copy((261627 & 1) != 0 ? charParameter.id : null, (261627 & 2) != 0 ? charParameter.title : null, (261627 & 4) != 0 ? charParameter.required : false, (261627 & 8) != 0 ? charParameter.immutable : false, (261627 & 16) != 0 ? charParameter.motivation : null, (261627 & 32) != 0 ? charParameter.updatesForm : null, (261627 & 64) != 0 ? charParameter.hint : null, (261627 & 128) != 0 ? charParameter._value : null, (261627 & 256) != 0 ? charParameter.displayingOptions : null, (261627 & 512) != 0 ? charParameter.constraints : null, (261627 & 1024) != 0 ? charParameter.button : null, (261627 & 2048) != 0 ? charParameter.placeholder : null, (261627 & 4096) != 0 ? charParameter.tags : null, (261627 & 8192) != 0 ? charParameter._inputType : null, (261627 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? charParameter.autogeneratedValue : null, (261627 & 32768) != 0 ? charParameter.visible : null, (261627 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? charParameter.phantom : null, (261627 & 131072) != 0 ? charParameter.widget : null);
            } else if (parameterSlot instanceof NumericParameter) {
                NumericParameter numericParameter = (NumericParameter) parameterSlot;
                parameterSlotCopy = numericParameter.copy((16383 & 1) != 0 ? numericParameter.id : null, (16383 & 2) != 0 ? numericParameter.title : null, (16383 & 4) != 0 ? numericParameter.required : false, (16383 & 8) != 0 ? numericParameter.immutable : false, (16383 & 16) != 0 ? numericParameter.motivation : null, (16383 & 32) != 0 ? numericParameter.updatesForm : null, (16383 & 64) != 0 ? numericParameter.hint : null, (16383 & 128) != 0 ? numericParameter._value : null, (16383 & 256) != 0 ? numericParameter.constraints : null, (16383 & 512) != 0 ? numericParameter.button : null, (16383 & 1024) != 0 ? numericParameter.displayingOptions : null, (16383 & 2048) != 0 ? numericParameter.placeholder : null, (16383 & 4096) != 0 ? numericParameter.visible : null, (16383 & 8192) != 0 ? numericParameter.phantom : null);
            } else if (parameterSlot instanceof PriceParameter) {
                PriceParameter priceParameter = (PriceParameter) parameterSlot;
                parameterSlotCopy = priceParameter.copy((8127 & 1) != 0 ? priceParameter.id : null, (8127 & 2) != 0 ? priceParameter.title : null, (8127 & 4) != 0 ? priceParameter.motivation : null, (8127 & 8) != 0 ? priceParameter.required : false, (8127 & 16) != 0 ? priceParameter.updatesForm : null, (8127 & 32) != 0 ? priceParameter.displayingOptions : null, (8127 & 64) != 0 ? priceParameter._value : null, (8127 & 128) != 0 ? priceParameter.constraints : null, (8127 & 256) != 0 ? priceParameter.placeholder : null, (8127 & 512) != 0 ? priceParameter.visible : null, (8127 & 1024) != 0 ? priceParameter.phantom : null, (8127 & 2048) != 0 ? priceParameter.button : null, (8127 & 4096) != 0 ? priceParameter.widget : null);
            } else if (parameterSlot instanceof EmailParameter) {
                EmailParameter emailParameter = (EmailParameter) parameterSlot;
                parameterSlotCopy = emailParameter.copy((4095 & 1) != 0 ? emailParameter.id : null, (4095 & 2) != 0 ? emailParameter.title : null, (4095 & 4) != 0 ? emailParameter.required : false, (4095 & 8) != 0 ? emailParameter.immutable : false, (4095 & 16) != 0 ? emailParameter.motivation : null, (4095 & 32) != 0 ? emailParameter.updatesForm : null, (4095 & 64) != 0 ? emailParameter.hint : null, (4095 & 128) != 0 ? emailParameter._value : null, (4095 & 256) != 0 ? emailParameter.constraints : null, (4095 & 512) != 0 ? emailParameter.placeholder : null, (4095 & 1024) != 0 ? emailParameter.visible : null, (4095 & 2048) != 0 ? emailParameter.phantom : null);
            } else if (parameterSlot instanceof IntParameter) {
                IntParameter intParameter = (IntParameter) parameterSlot;
                parameterSlotCopy = intParameter.copy((32766 & 1) != 0 ? intParameter.id : null, (32766 & 2) != 0 ? intParameter.title : null, (32766 & 4) != 0 ? intParameter.required : false, (32766 & 8) != 0 ? intParameter.immutable : false, (32766 & 16) != 0 ? intParameter.motivation : null, (32766 & 32) != 0 ? intParameter.updatesForm : null, (32766 & 64) != 0 ? intParameter.hint : null, (32766 & 128) != 0 ? intParameter._value : null, (32766 & 256) != 0 ? intParameter.constraints : null, (32766 & 512) != 0 ? intParameter.displayingOptions : null, (32766 & 1024) != 0 ? intParameter.placeholder : null, (32766 & 2048) != 0 ? intParameter.button : null, (32766 & 4096) != 0 ? intParameter.visible : null, (32766 & 8192) != 0 ? intParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? intParameter.widget : null);
            } else if (parameterSlot instanceof PhoneParameter) {
                PhoneParameter phoneParameter = (PhoneParameter) parameterSlot;
                parameterSlotCopy = phoneParameter.copy((8191 & 1) != 0 ? phoneParameter.id : null, (8191 & 2) != 0 ? phoneParameter.title : null, (8191 & 4) != 0 ? phoneParameter.required : false, (8191 & 8) != 0 ? phoneParameter.immutable : false, (8191 & 16) != 0 ? phoneParameter.motivation : null, (8191 & 32) != 0 ? phoneParameter.updatesForm : null, (8191 & 64) != 0 ? phoneParameter.hint : null, (8191 & 128) != 0 ? phoneParameter._value : null, (8191 & 256) != 0 ? phoneParameter.displayingOptions : null, (8191 & 512) != 0 ? phoneParameter.constraints : null, (8191 & 1024) != 0 ? phoneParameter.placeholder : null, (8191 & 2048) != 0 ? phoneParameter.visible : null, (8191 & 4096) != 0 ? phoneParameter.phantom : null);
            } else if (parameterSlot instanceof PhotoParameter) {
                PhotoParameter photoParameter = (PhotoParameter) parameterSlot;
                parameterSlotCopy = photoParameter.copy((8015 & 1) != 0 ? photoParameter.id : null, (8015 & 2) != 0 ? photoParameter.title : null, (8015 & 4) != 0 ? photoParameter.description : null, (8015 & 8) != 0 ? photoParameter.motivation : null, (8015 & 16) != 0 ? photoParameter.maxCount : 0, (8015 & 32) != 0 ? photoParameter.constraints : null, (8015 & 64) != 0 ? photoParameter._value : null, (8015 & 128) != 0 ? photoParameter.required : false, (8015 & 256) != 0 ? photoParameter.shouldUploadPhotoForCV : false, (8015 & 512) != 0 ? photoParameter.suggestByPhotoMaxImages : null, (8015 & 1024) != 0 ? photoParameter.displayingOptions : null, (8015 & 2048) != 0 ? photoParameter.visible : null, (8015 & 4096) != 0 ? photoParameter.phantom : null);
            } else if (parameterSlot instanceof DateTimeIntervalParameter) {
                DateTimeIntervalParameter dateTimeIntervalParameter = (DateTimeIntervalParameter) parameterSlot;
                DateTimeParameter start = dateTimeIntervalParameter.getStart();
                DateTimeParameter dateTimeParameterCopy = start != null ? start.copy((32767 & 1) != 0 ? start.id : null, (32767 & 2) != 0 ? start.title : null, (32767 & 4) != 0 ? start.required : false, (32767 & 8) != 0 ? start.immutable : false, (32767 & 16) != 0 ? start.motivation : null, (32767 & 32) != 0 ? start.updatesForm : null, (32767 & 64) != 0 ? start._value : null, (32767 & 128) != 0 ? start.presentTime : null, (32767 & 256) != 0 ? start.selectionType : null, (32767 & 512) != 0 ? start.restrictions : null, (32767 & 1024) != 0 ? start.constraints : null, (32767 & 2048) != 0 ? start.placeholder : null, (32767 & 4096) != 0 ? start.visible : null, (32767 & 8192) != 0 ? start.phantom : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? start.displayingOptions : null) : null;
                DateTimeParameter end = dateTimeIntervalParameter.getEnd();
                parameterSlotCopy = dateTimeIntervalParameter.copy((927 & 1) != 0 ? dateTimeIntervalParameter.id : null, (927 & 2) != 0 ? dateTimeIntervalParameter.title : null, (927 & 4) != 0 ? dateTimeIntervalParameter.parameterRequired : false, (927 & 8) != 0 ? dateTimeIntervalParameter.immutable : false, (927 & 16) != 0 ? dateTimeIntervalParameter.motivation : null, (927 & 32) != 0 ? dateTimeIntervalParameter.start : dateTimeParameterCopy, (927 & 64) != 0 ? dateTimeIntervalParameter.end : end != null ? end.copy((32767 & 1) != 0 ? end.id : null, (32767 & 2) != 0 ? end.title : null, (32767 & 4) != 0 ? end.required : false, (32767 & 8) != 0 ? end.immutable : false, (32767 & 16) != 0 ? end.motivation : null, (32767 & 32) != 0 ? end.updatesForm : null, (32767 & 64) != 0 ? end._value : null, (32767 & 128) != 0 ? end.presentTime : null, (32767 & 256) != 0 ? end.selectionType : null, (32767 & 512) != 0 ? end.restrictions : null, (32767 & 1024) != 0 ? end.constraints : null, (32767 & 2048) != 0 ? end.placeholder : null, (32767 & 4096) != 0 ? end.visible : null, (32767 & 8192) != 0 ? end.phantom : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? end.displayingOptions : null) : null, (927 & 128) != 0 ? dateTimeIntervalParameter.visible : null, (927 & 256) != 0 ? dateTimeIntervalParameter.phantom : null, (927 & 512) != 0 ? dateTimeIntervalParameter.displayingOptions : null);
            } else if (parameterSlot instanceof DateTimeRangeParameter) {
                DateTimeRangeParameter dateTimeRangeParameter = (DateTimeRangeParameter) parameterSlot;
                DateTimeRangeParameter.Widget widget = dateTimeRangeParameter.getWidget();
                if (widget != null) {
                    DateTimeRangeParameter.Widget widget2 = dateTimeRangeParameter.getWidget();
                    if (widget2 == null || (config = widget2.getConfig()) == null) {
                        configCopy$default = null;
                    } else {
                        DateTimeRangePoint start2 = dateTimeRangeParameter.getStart();
                        DateTimeRangePoint dateTimeRangePointCopy$default = start2 != null ? DateTimeRangePoint.copy$default(start2, null, false, null, null, 15, null) : null;
                        DateTimeRangePoint end2 = dateTimeRangeParameter.getEnd();
                        configCopy$default = DateTimeRangeParameter.Widget.Config.copy$default(config, dateTimeRangePointCopy$default, end2 != null ? DateTimeRangePoint.copy$default(end2, null, false, null, null, 15, null) : null, null, 4, null);
                    }
                    widgetCopy = widget.copy(configCopy$default);
                } else {
                    widgetCopy = null;
                }
                parameterSlotCopy = dateTimeRangeParameter.copy((223 & 1) != 0 ? dateTimeRangeParameter.id : null, (223 & 2) != 0 ? dateTimeRangeParameter.title : null, (223 & 4) != 0 ? dateTimeRangeParameter.parameterRequired : false, (223 & 8) != 0 ? dateTimeRangeParameter.immutable : false, (223 & 16) != 0 ? dateTimeRangeParameter.motivation : null, (223 & 32) != 0 ? dateTimeRangeParameter.widget : widgetCopy, (223 & 64) != 0 ? dateTimeRangeParameter.updatesForm : null, (223 & 128) != 0 ? dateTimeRangeParameter._value : null);
            } else if (parameterSlot instanceof DateTimeParameter) {
                DateTimeParameter dateTimeParameter = (DateTimeParameter) parameterSlot;
                parameterSlotCopy = dateTimeParameter.copy((32767 & 1) != 0 ? dateTimeParameter.id : null, (32767 & 2) != 0 ? dateTimeParameter.title : null, (32767 & 4) != 0 ? dateTimeParameter.required : false, (32767 & 8) != 0 ? dateTimeParameter.immutable : false, (32767 & 16) != 0 ? dateTimeParameter.motivation : null, (32767 & 32) != 0 ? dateTimeParameter.updatesForm : null, (32767 & 64) != 0 ? dateTimeParameter._value : null, (32767 & 128) != 0 ? dateTimeParameter.presentTime : null, (32767 & 256) != 0 ? dateTimeParameter.selectionType : null, (32767 & 512) != 0 ? dateTimeParameter.restrictions : null, (32767 & 1024) != 0 ? dateTimeParameter.constraints : null, (32767 & 2048) != 0 ? dateTimeParameter.placeholder : null, (32767 & 4096) != 0 ? dateTimeParameter.visible : null, (32767 & 8192) != 0 ? dateTimeParameter.phantom : null, (32767 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dateTimeParameter.displayingOptions : null);
            } else if (parameterSlot instanceof BooleanParameter) {
                BooleanParameter booleanParameter = (BooleanParameter) parameterSlot;
                parameterSlotCopy = booleanParameter.copy((16383 & 1) != 0 ? booleanParameter.id : null, (16383 & 2) != 0 ? booleanParameter.title : null, (16383 & 4) != 0 ? booleanParameter.required : false, (16383 & 8) != 0 ? booleanParameter.immutable : false, (16383 & 16) != 0 ? booleanParameter.motivation : null, (16383 & 32) != 0 ? booleanParameter.updatesForm : null, (16383 & 64) != 0 ? booleanParameter.subtitle : null, (16383 & 128) != 0 ? booleanParameter._value : null, (16383 & 256) != 0 ? booleanParameter.header : null, (16383 & 512) != 0 ? booleanParameter.displayingOptions : null, (16383 & 1024) != 0 ? booleanParameter.hint : null, (16383 & 2048) != 0 ? booleanParameter.visible : null, (16383 & 4096) != 0 ? booleanParameter.phantom : null, (16383 & 8192) != 0 ? booleanParameter.resetAreaOnChange : false);
            } else if (parameterSlot instanceof DateRangeParameter) {
                parameterSlotCopy = DateRangeParameter.copy$default((DateRangeParameter) parameterSlot, null, null, null, null, null, null, 63, null);
            } else if (parameterSlot instanceof MetroParameter) {
                MetroParameter metroParameter = (MetroParameter) parameterSlot;
                parameterSlotCopy = metroParameter.copy((8191 & 1) != 0 ? metroParameter.id : null, (8191 & 2) != 0 ? metroParameter.title : null, (8191 & 4) != 0 ? metroParameter.motivation : null, (8191 & 8) != 0 ? metroParameter.updatesForm : null, (8191 & 16) != 0 ? metroParameter.placeholder : null, (8191 & 32) != 0 ? metroParameter._value : null, (8191 & 64) != 0 ? metroParameter.visible : null, (8191 & 128) != 0 ? metroParameter.phantom : null, (8191 & 256) != 0 ? metroParameter.displayingOptions : null, (8191 & 512) != 0 ? metroParameter.resetAreaOnChange : false, (8191 & 1024) != 0 ? metroParameter.required : false, (8191 & 2048) != 0 ? metroParameter.widget : null, (8191 & 4096) != 0 ? metroParameter.constraints : null);
            } else if (parameterSlot instanceof AddressesSearchParameter) {
                AddressesSearchParameter addressesSearchParameter = (AddressesSearchParameter) parameterSlot;
                parameterSlotCopy = addressesSearchParameter.copy((4095 & 1) != 0 ? addressesSearchParameter.id : null, (4095 & 2) != 0 ? addressesSearchParameter.title : null, (4095 & 4) != 0 ? addressesSearchParameter.placeholder : null, (4095 & 8) != 0 ? addressesSearchParameter.motivation : null, (4095 & 16) != 0 ? addressesSearchParameter.updatesForm : null, (4095 & 32) != 0 ? addressesSearchParameter._value : null, (4095 & 64) != 0 ? addressesSearchParameter.required : false, (4095 & 128) != 0 ? addressesSearchParameter.visible : null, (4095 & 256) != 0 ? addressesSearchParameter.phantom : null, (4095 & 512) != 0 ? addressesSearchParameter.immutable : false, (4095 & 1024) != 0 ? addressesSearchParameter.displayingOptions : null, (4095 & 2048) != 0 ? addressesSearchParameter.resetAreaOnChange : false);
            } else if (parameterSlot instanceof SelectDeepLinkParameter) {
                SelectDeepLinkParameter selectDeepLinkParameter = (SelectDeepLinkParameter) parameterSlot;
                parameterSlotCopy = selectDeepLinkParameter.copy((2047 & 1) != 0 ? selectDeepLinkParameter.id : null, (2047 & 2) != 0 ? selectDeepLinkParameter.title : null, (2047 & 4) != 0 ? selectDeepLinkParameter.required : false, (2047 & 8) != 0 ? selectDeepLinkParameter.immutable : false, (2047 & 16) != 0 ? selectDeepLinkParameter.motivation : null, (2047 & 32) != 0 ? selectDeepLinkParameter.updatesForm : null, (2047 & 64) != 0 ? selectDeepLinkParameter._value : null, (2047 & 128) != 0 ? selectDeepLinkParameter.placeholder : null, (2047 & 256) != 0 ? selectDeepLinkParameter.deepLink : null, (2047 & 512) != 0 ? selectDeepLinkParameter.visible : null, (2047 & 1024) != 0 ? selectDeepLinkParameter.phantom : null);
            } else if (parameterSlot instanceof VideoParameter) {
                VideoParameter videoParameter = (VideoParameter) parameterSlot;
                parameterSlotCopy = videoParameter.copy((16383 & 1) != 0 ? videoParameter.id : null, (16383 & 2) != 0 ? videoParameter.title : null, (16383 & 4) != 0 ? videoParameter.required : false, (16383 & 8) != 0 ? videoParameter.immutable : false, (16383 & 16) != 0 ? videoParameter.motivation : null, (16383 & 32) != 0 ? videoParameter.hint : null, (16383 & 64) != 0 ? videoParameter.displayingOptions : null, (16383 & 128) != 0 ? videoParameter.updatesForm : null, (16383 & 256) != 0 ? videoParameter.placeholder : null, (16383 & 512) != 0 ? videoParameter.constraints : null, (16383 & 1024) != 0 ? videoParameter._value : null, (16383 & 2048) != 0 ? videoParameter.button : null, (16383 & 4096) != 0 ? videoParameter.visible : null, (16383 & 8192) != 0 ? videoParameter.phantom : null);
            } else if (parameterSlot instanceof BannerCheckBoxWithImageParameter) {
                BannerCheckBoxWithImageParameter bannerCheckBoxWithImageParameter = (BannerCheckBoxWithImageParameter) parameterSlot;
                parameterSlotCopy = bannerCheckBoxWithImageParameter.copy((511 & 1) != 0 ? bannerCheckBoxWithImageParameter.id : null, (511 & 2) != 0 ? bannerCheckBoxWithImageParameter.title : null, (511 & 4) != 0 ? bannerCheckBoxWithImageParameter.required : false, (511 & 8) != 0 ? bannerCheckBoxWithImageParameter.immutable : false, (511 & 16) != 0 ? bannerCheckBoxWithImageParameter.motivation : null, (511 & 32) != 0 ? bannerCheckBoxWithImageParameter.updatesForm : null, (511 & 64) != 0 ? bannerCheckBoxWithImageParameter._value : null, (511 & 128) != 0 ? bannerCheckBoxWithImageParameter.values : null, (511 & 256) != 0 ? bannerCheckBoxWithImageParameter.displayingOptions : null);
            } else {
                parameterSlotCopy = parameterSlot;
            }
            if (parameterSlot instanceof HasError) {
                HasError hasError = (HasError) parameterSlot;
                if (parameterSlotCopy instanceof HasError) {
                    HasError hasError2 = (HasError) parameterSlotCopy;
                    hasError2.setError(hasError.getError());
                    hasError2.setError(hasError.getError());
                }
            }
            arrayList.add(parameterSlotCopy);
        }
        return arrayList;
    }

    @Override // com.avito.android.publish.objects.P0
    public final void a(@Y61.k ObjectsParameter objectsParameter) {
        CategoryParameters categoryParameters = this.f237565a.f231873k0;
        ParameterSlot parameterSlotFindParameter = categoryParameters != null ? categoryParameters.findParameter(objectsParameter.getId()) : null;
        ObjectsParameter objectsParameter2 = parameterSlotFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parameterSlotFindParameter : null;
        if (objectsParameter2 == null) {
            return;
        }
        objectsParameter2.applyChangedValue(objectsParameter.getValue());
    }

    @Override // com.avito.android.publish.objects.P0
    @Y61.k
    public final ObjectsParameter b(@Y61.k String str) {
        CategoryParameters categoryParameters = this.f237565a.f231873k0;
        ArrayList arrayList = null;
        ParameterSlot parameterSlotFindParameter = categoryParameters != null ? categoryParameters.findParameter(str) : null;
        ObjectsParameter objectsParameter = parameterSlotFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parameterSlotFindParameter : null;
        if (objectsParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<ParameterSlot> params = objectsParameter.getParams();
        ArrayList arrayListC = params != null ? c(params) : null;
        List<? extends List<? extends ParameterSlot>> list = objectsParameter.get_value();
        if (list != null) {
            List<? extends List<? extends ParameterSlot>> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                RandomAccess randomAccessC = c((List) it.next());
                if (randomAccessC == null) {
                    randomAccessC = C42784z0.f406748b;
                }
                arrayList.add(randomAccessC);
            }
        }
        return objectsParameter.copy((16127 & 1) != 0 ? objectsParameter.id : null, (16127 & 2) != 0 ? objectsParameter.title : null, (16127 & 4) != 0 ? objectsParameter.required : false, (16127 & 8) != 0 ? objectsParameter.immutable : false, (16127 & 16) != 0 ? objectsParameter.motivation : null, (16127 & 32) != 0 ? objectsParameter.restrictions : null, (16127 & 64) != 0 ? objectsParameter.summary : null, (16127 & 128) != 0 ? objectsParameter.params : arrayListC, (16127 & 256) != 0 ? objectsParameter._value : arrayList, (16127 & 512) != 0 ? objectsParameter.displayingOptions : null, (16127 & 1024) != 0 ? objectsParameter.visible : null, (16127 & 2048) != 0 ? objectsParameter.phantom : null, (16127 & 4096) != 0 ? objectsParameter.widget : objectsParameter.getWidget(), (16127 & 8192) != 0 ? objectsParameter.constraints : null);
    }
}
