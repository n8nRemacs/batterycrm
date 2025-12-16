package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.adjust.sdk.Constants;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.alignment.AvitoMapHorizontalAlignment;
import com.avito.android.avito_map.alignment.AvitoMapVerticalAlignment;
import com.avito.android.avito_map.yandex.AvitoMapPolygon;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import j.InterfaceC42165v;
import j.f0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoMap.kt */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\bf\u0018\u00002\u00020\u0001:\f\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0015J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0018J+\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\"\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\"\u0010#JK\u0010&\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00162\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u0003H&¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010,\u001a\u00020\rH&¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b2\u00101JA\u00109\u001a\u0002082\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u00103\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r2\b\b\u0001\u00107\u001a\u00020\u0003H&¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\u0002082\u0006\u0010<\u001a\u00020;H&¢\u0006\u0004\b9\u0010=JA\u00109\u001a\u0002082\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r2\b\b\u0001\u00107\u001a\u00020\u0003H&¢\u0006\u0004\b9\u0010@JM\u0010E\u001a\b\u0012\u0004\u0012\u0002080\u001d2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\b\u0010C\u001a\u0004\u0018\u00010B2\b\b\u0002\u00105\u001a\u0002042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010D\u001a\u00020\u000bH&¢\u0006\u0004\bE\u0010FJ?\u00109\u001a\u0002082\u0006\u0010\n\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010B2\b\b\u0002\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010D\u001a\u00020\u000bH&¢\u0006\u0004\b9\u0010GJK\u00109\u001a\u0002082\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010C\u001a\u00020B2\b\b\u0002\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\r2\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020\u000bH&¢\u0006\u0004\b9\u0010KJW\u0010S\u001a\u00020R2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\r2\u0006\u00106\u001a\u00020\r2\b\b\u0002\u0010Q\u001a\u00020\u000bH&¢\u0006\u0004\bS\u0010TJG\u0010W\u001a\u00020V2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\u0006\u0010U\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\r2\u0006\u00106\u001a\u00020\r2\b\b\u0002\u0010Q\u001a\u00020\u000bH&¢\u0006\u0004\bW\u0010XJA\u0010[\u001a\u0002082\u0006\u0010\n\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010U\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\rH&¢\u0006\u0004\b[\u0010\\J)\u0010_\u001a\u0002082\u0006\u0010]\u001a\u00020\t2\u0006\u0010^\u001a\u00020\u000b2\b\b\u0001\u00107\u001a\u00020\u0003H&¢\u0006\u0004\b_\u0010`JA\u0010a\u001a\u0002082\u0006\u0010]\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00032\u0006\u0010U\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\rH&¢\u0006\u0004\ba\u0010\\J!\u0010c\u001a\u00020\u000f2\u0006\u0010b\u001a\u0002082\b\b\u0002\u0010J\u001a\u00020\u000bH&¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020RH&¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020VH&¢\u0006\u0004\bi\u0010jJ\u000f\u0010l\u001a\u00020kH&¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0016H&¢\u0006\u0004\bn\u0010oJ\u0019\u0010q\u001a\u0004\u0018\u00010\t2\u0006\u0010]\u001a\u00020pH&¢\u0006\u0004\bq\u0010rJ\u0019\u0010t\u001a\u0004\u0018\u00010p2\u0006\u0010s\u001a\u00020\tH&¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020vH&¢\u0006\u0004\bw\u0010xJ\u0019\u0010{\u001a\u00020\u000f2\b\u0010z\u001a\u0004\u0018\u00010yH&¢\u0006\u0004\b{\u0010|J\u0019\u0010~\u001a\u00020\u000f2\b\u0010z\u001a\u0004\u0018\u00010}H&¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0081\u0001\u001a\u00020\u000f2\t\u0010z\u001a\u0005\u0018\u00010\u0080\u0001H&¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010\u0084\u0001\u001a\u00020\u000f2\t\u0010z\u001a\u0005\u0018\u00010\u0083\u0001H&¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001d\u0010\u0087\u0001\u001a\u00020\u000f2\t\u0010z\u001a\u0005\u0018\u00010\u0086\u0001H&¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0012\u0010\u0089\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0012\u0010\u008b\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b\u008c\u0001\u0010\u008a\u0001J\u0012\u0010\u008d\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u000f2\u0007\u0010\u008e\u0001\u001a\u00020kH&¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J\u001d\u0010\u0093\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u0092\u0001\u001a\u00020\u000bH&¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001b\u0010\u0096\u0001\u001a\u00020\u000f2\u0007\u0010\u0095\u0001\u001a\u00020\rH&¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0098\u0001\u001a\u00020\u000f2\u0007\u0010\u0095\u0001\u001a\u00020\rH&¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J&\u0010\u009d\u0001\u001a\u00020\u000f2\b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H&¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J$\u0010¡\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\u00032\u0007\u0010 \u0001\u001a\u00020\u0003H&¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001d\u0010¤\u0001\u001a\u00020\u000f2\t\b\u0002\u0010£\u0001\u001a\u00020\u000bH&¢\u0006\u0006\b¤\u0001\u0010\u0094\u0001J6\u0010©\u0001\u001a\u00020\u000f2\u0007\u0010¥\u0001\u001a\u00020\u00032\u0007\u0010¦\u0001\u001a\u00020\u00032\u0007\u0010§\u0001\u001a\u00020\u00032\u0007\u0010¨\u0001\u001a\u00020\u0003H&¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0012\u0010«\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b«\u0001\u0010\u008a\u0001J\u0012\u0010¬\u0001\u001a\u00020\u000fH&¢\u0006\u0006\b¬\u0001\u0010\u008a\u0001¨\u0006³\u0001"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap;", "", "Lkotlin/Q;", "", "getSize", "()Lkotlin/Q;", "Lcom/avito/android/avito_map/AvitoMapUiSettings;", "getUiSettings", "()Lcom/avito/android/avito_map/AvitoMapUiSettings;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "avitoMapPoint", "", "animate", "", "zoomLevel", "Lkotlin/G0;", "moveTo", "(Lcom/avito/android/avito_map/AvitoMapPoint;ZLjava/lang/Float;)V", "", "latitude", "longitude", "(DDZLjava/lang/Float;)V", "Lcom/avito/android/avito_map/AvitoMapBounds;", "avitoMapBounds", "(Lcom/avito/android/avito_map/AvitoMapBounds;Z)V", "Lcom/avito/android/avito_map/AvitoMap$AnimationLength;", "animationLength", "zoomTo", "(FZLcom/avito/android/avito_map/AvitoMap$AnimationLength;)V", "", "points", "zoomPadding", "mapHeight", "centerPoint", "moveToPointsWithPaddingCentered", "(Ljava/util/List;Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/avito/android/avito_map/AvitoMapPoint;)V", "Lcom/avito/android/avito_map/ZoomOffset;", "zoomOffset", "moveToPointsWithPadding", "(Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/avito_map/ZoomOffset;ZLjava/lang/Integer;)V", "bounds", "boundsPadding", "moveToBounds", "(Lcom/avito/android/avito_map/AvitoMapBounds;ZI)V", "radiusInMeter", "moveToCircle", "(Lcom/avito/android/avito_map/AvitoMapPoint;F)V", "delta", "zoomOut", "(FZ)V", "zoomIn", "id", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "zIndex", "themeResId", "Lcom/avito/android/avito_map/AvitoMapMarker;", "addMarker", "(Lcom/avito/android/avito_map/AvitoMapPoint;ILcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;I)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarkerOptions;", "options", "(Lcom/avito/android/avito_map/AvitoMapMarkerOptions;)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarker$Type;", "type", "(Lcom/avito/android/avito_map/AvitoMapPoint;Lcom/avito/android/avito_map/AvitoMapMarker$Type;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;I)Lcom/avito/android/avito_map/AvitoMapMarker;", "avitoMapPoints", "Landroid/graphics/Bitmap;", "bitmap", "isVisible", "addSameMarkers", "(Ljava/util/List;Landroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;Z)Ljava/util/List;", "(Lcom/avito/android/avito_map/AvitoMapPoint;Landroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;Z)Lcom/avito/android/avito_map/AvitoMapMarker;", "", "imageId", "withAnimation", "(DDLandroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;FLjava/lang/String;Z)Lcom/avito/android/avito_map/AvitoMapMarker;", "outlineColor", "outlineWidth", "strokeColor", "withGaps", "strokeWidth", "addToMemory", "Lcom/avito/android/avito_map/AvitoMapPolyline;", "addPolyline", "(Ljava/util/List;IFIZFFZ)Lcom/avito/android/avito_map/AvitoMapPolyline;", "fillColor", "Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "addPolygon", "(Ljava/util/List;IIFFZ)Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "radius", "width", "addCircle", "(Lcom/avito/android/avito_map/AvitoMapPoint;FFIIF)Lcom/avito/android/avito_map/AvitoMapMarker;", "point", "isApproximated", "addUserCoords", "(Lcom/avito/android/avito_map/AvitoMapPoint;ZI)Lcom/avito/android/avito_map/AvitoMapMarker;", "addApproximatedLocation", "marker", "removeMarker", "(Lcom/avito/android/avito_map/AvitoMapMarker;Z)V", "polyline", "removePolyline", "(Lcom/avito/android/avito_map/AvitoMapPolyline;)V", "polygon", "removePolygon", "(Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;)V", "Lcom/avito/android/avito_map/AvitoMapTarget;", "getMapTarget", "()Lcom/avito/android/avito_map/AvitoMapTarget;", "getMapBounds", "()Lcom/avito/android/avito_map/AvitoMapBounds;", "Landroid/graphics/Point;", "fromScreenLocation", "(Landroid/graphics/Point;)Lcom/avito/android/avito_map/AvitoMapPoint;", "latLng", "toScreenLocation", "(Lcom/avito/android/avito_map/AvitoMapPoint;)Landroid/graphics/Point;", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "getMapCameraPosition", "()Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "listener", "addMoveStartListener", "(Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "addMoveEndListener", "(Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "addMapClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MapClickListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "addMarkerClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;", "addMarkerExactClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;)V", "clearMoveStartListeners", "()V", "clearMoveEndListeners", "clearMarkerClickListeners", "clearMapClickListeners", "target", "restoreTarget", "(Lcom/avito/android/avito_map/AvitoMapTarget;)V", "onStart", "clearAll", "onStop", "(Z)V", "zoomPreference", "setMaxZoomPreference", "(F)V", "setMinZoomPreference", "Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;", "horizontalAlignment", "Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;", "verticalAlignment", "setLogoAlignment", "(Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;)V", "verticalPadding", "horizontalPadding", "setLogoPadding", "(II)V", "distinct", "distinctSameMoveEvent", "top", "right", "bottom", "left", "setPadding", "(IIII)V", "onLowMemory", "clearDrawing", "AnimationLength", "MapClickListener", "MapMoveEndListener", "MapMoveStartListener", "MarkerClickListener", "MarkerExactClickListener", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvitoMap {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$AnimationLength;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FAST", "DEFAULT", "LONG", "Companion", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimationLength {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AnimationLength[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;
        private final int value;

        @c("fast")
        public static final AnimationLength FAST = new AnimationLength("FAST", 0, 0);

        @c("default")
        public static final AnimationLength DEFAULT = new AnimationLength("DEFAULT", 1, 1);

        @c(Constants.LONG)
        public static final AnimationLength LONG = new AnimationLength("LONG", 2, 2);

        /* compiled from: AvitoMap.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$AnimationLength$Companion;", "", "()V", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/avito_map/AvitoMap$AnimationLength;", "value", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final AnimationLength from(int value) {
                AnimationLength next;
                Iterator<AnimationLength> it = AnimationLength.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.getValue() == value) {
                        break;
                    }
                }
                AnimationLength animationLength = next;
                return animationLength == null ? AnimationLength.DEFAULT : animationLength;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ AnimationLength[] $values() {
            return new AnimationLength[]{FAST, DEFAULT, LONG};
        }

        static {
            AnimationLength[] animationLengthArr$values = $values();
            $VALUES = animationLengthArr$values;
            $ENTRIES = kotlin.enums.c.a(animationLengthArr$values);
            INSTANCE = new Companion(null);
        }

        private AnimationLength(String str, int i12, int i13) {
            this.value = i13;
        }

        @k
        public static a<AnimationLength> getEntries() {
            return $ENTRIES;
        }

        public static AnimationLength valueOf(String str) {
            return (AnimationLength) Enum.valueOf(AnimationLength.class, str);
        }

        public static AnimationLength[] values() {
            return (AnimationLength[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "", "Lcom/avito/android/avito_map/AvitoMapTarget;", "mapTarget", "Lkotlin/G0;", "onMapClicked", "(Lcom/avito/android/avito_map/AvitoMapTarget;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MapClickListener {
        void onMapClicked(@k AvitoMapTarget mapTarget);
    }

    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "mapCameraPosition", "Lkotlin/G0;", "onMapSettled", "(Lcom/avito/android/avito_map/AvitoMapCameraPosition;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MapMoveEndListener {
        void onMapSettled(@k AvitoMapCameraPosition mapCameraPosition);
    }

    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "", "Lcom/avito/android/avito_map/AvitoMapMoveReason;", "reason", "Lkotlin/G0;", "onMapMoveStarted", "(Lcom/avito/android/avito_map/AvitoMapMoveReason;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MapMoveStartListener {
        void onMapMoveStarted(@k AvitoMapMoveReason reason);
    }

    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "", "data", "Lkotlin/G0;", "onMarkerClicked", "(Ljava/lang/Object;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MarkerClickListener {
        void onMarkerClicked(@l Object data);
    }

    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;", "", "onMarkerClicked", "", "marker", "Lcom/avito/android/avito_map/AvitoMapMarker;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MarkerExactClickListener {
        boolean onMarkerClicked(@l AvitoMapMarker marker);
    }

    @k
    AvitoMapMarker addApproximatedLocation(@k AvitoMapPoint point, float radius, float zIndex, int strokeColor, int fillColor, float width);

    @k
    AvitoMapMarker addCircle(@k AvitoMapPoint avitoMapPoint, float radius, float zIndex, int strokeColor, int fillColor, float width);

    void addMapClickListener(@l MapClickListener listener);

    @k
    AvitoMapMarker addMarker(double latitude, double longitude, @k Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, float zIndex, @k String imageId, boolean withAnimation);

    @k
    AvitoMapMarker addMarker(@k AvitoMapMarkerOptions options);

    @k
    AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @InterfaceC42165v int id2, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, @f0 int themeResId);

    @k
    AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @l Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, boolean isVisible);

    @k
    AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @k AvitoMapMarker.Type type, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, @f0 int themeResId);

    void addMarkerClickListener(@l MarkerClickListener listener);

    void addMarkerExactClickListener(@l MarkerExactClickListener listener);

    void addMoveEndListener(@l MapMoveEndListener listener);

    void addMoveStartListener(@l MapMoveStartListener listener);

    @k
    AvitoMapPolygon addPolygon(@k List<AvitoMapPoint> avitoMapPoints, int fillColor, int strokeColor, float strokeWidth, float zIndex, boolean addToMemory);

    @k
    AvitoMapPolyline addPolyline(@k List<AvitoMapPoint> avitoMapPoints, int outlineColor, float outlineWidth, int strokeColor, boolean withGaps, float strokeWidth, float zIndex, boolean addToMemory);

    @k
    List<AvitoMapMarker> addSameMarkers(@k List<AvitoMapPoint> avitoMapPoints, @l Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, boolean isVisible);

    @k
    AvitoMapMarker addUserCoords(@k AvitoMapPoint point, boolean isApproximated, @f0 int themeResId);

    void clearDrawing();

    void clearMapClickListeners();

    void clearMarkerClickListeners();

    void clearMoveEndListeners();

    void clearMoveStartListeners();

    void distinctSameMoveEvent(boolean distinct);

    @l
    AvitoMapPoint fromScreenLocation(@k Point point);

    @k
    AvitoMapBounds getMapBounds();

    @k
    AvitoMapCameraPosition getMapCameraPosition();

    @k
    AvitoMapTarget getMapTarget();

    @k
    Q<Integer, Integer> getSize();

    @k
    AvitoMapUiSettings getUiSettings();

    void moveTo(double latitude, double longitude, boolean animate, @l Float zoomLevel);

    void moveTo(@k AvitoMapBounds avitoMapBounds, boolean animate);

    void moveTo(@k AvitoMapPoint avitoMapPoint, boolean animate, @l Float zoomLevel);

    void moveToBounds(@k AvitoMapBounds bounds, boolean animate, int boundsPadding);

    void moveToCircle(@l AvitoMapPoint centerPoint, float radiusInMeter);

    void moveToPointsWithPadding(@k List<AvitoMapPoint> points, @l Integer zoomPadding, @l ZoomOffset zoomOffset, boolean animate, @l Integer mapHeight);

    void moveToPointsWithPaddingCentered(@k List<AvitoMapPoint> points, @l Integer zoomPadding, boolean animate, @l Integer mapHeight, @l AvitoMapPoint centerPoint);

    void onLowMemory();

    void onStart();

    void onStop(boolean clearAll);

    void removeMarker(@k AvitoMapMarker marker, boolean withAnimation);

    void removePolygon(@k AvitoMapPolygon polygon);

    void removePolyline(@k AvitoMapPolyline polyline);

    void restoreTarget(@k AvitoMapTarget target);

    void setLogoAlignment(@k AvitoMapHorizontalAlignment horizontalAlignment, @k AvitoMapVerticalAlignment verticalAlignment);

    void setLogoPadding(int verticalPadding, int horizontalPadding);

    void setMaxZoomPreference(float zoomPreference);

    void setMinZoomPreference(float zoomPreference);

    void setPadding(int top, int right, int bottom, int left);

    @l
    Point toScreenLocation(@k AvitoMapPoint latLng);

    void zoomIn(float delta, boolean animate);

    void zoomOut(float delta, boolean animate);

    void zoomTo(float zoomLevel, boolean animate, @k AnimationLength animationLength);

    /* compiled from: AvitoMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ AvitoMapMarker addApproximatedLocation$default(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint, float f12, float f13, int i12, int i13, float f14, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addApproximatedLocation");
            }
            if ((i14 & 4) != 0) {
                f13 = 0.0f;
            }
            return avitoMap.addApproximatedLocation(avitoMapPoint, f12, f13, i12, i13, f14);
        }

        public static /* synthetic */ AvitoMapMarker addCircle$default(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint, float f12, float f13, int i12, int i13, float f14, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCircle");
            }
            if ((i14 & 4) != 0) {
                f13 = 0.0f;
            }
            return avitoMap.addCircle(avitoMapPoint, f12, f13, i12, i13, f14);
        }

        public static /* synthetic */ AvitoMapMarker addMarker$default(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint, int i12, AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, Float f12, int i13, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
            }
            if ((i14 & 4) != 0) {
                avitoMapAnchor = AvitoMapMarker.Anchor.CENTER;
            }
            AvitoMapMarker.AvitoMapAnchor avitoMapAnchor2 = avitoMapAnchor;
            if ((i14 & 8) != 0) {
                f12 = Float.valueOf(0.0f);
            }
            return avitoMap.addMarker(avitoMapPoint, i12, avitoMapAnchor2, f12, i13);
        }

        public static /* synthetic */ AvitoMapPolygon addPolygon$default(AvitoMap avitoMap, List list, int i12, int i13, float f12, float f13, boolean z12, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPolygon");
            }
            if ((i14 & 32) != 0) {
                z12 = true;
            }
            return avitoMap.addPolygon(list, i12, i13, f12, f13, z12);
        }

        public static /* synthetic */ AvitoMapPolyline addPolyline$default(AvitoMap avitoMap, List list, int i12, float f12, int i13, boolean z12, float f13, float f14, boolean z13, int i14, Object obj) {
            if (obj == null) {
                return avitoMap.addPolyline(list, i12, f12, i13, z12, f13, f14, (i14 & 128) != 0 ? true : z13);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPolyline");
        }

        public static /* synthetic */ List addSameMarkers$default(AvitoMap avitoMap, List list, Bitmap bitmap, AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, Float f12, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSameMarkers");
            }
            if ((i12 & 4) != 0) {
                avitoMapAnchor = AvitoMapMarker.Anchor.CENTER;
            }
            AvitoMapMarker.AvitoMapAnchor avitoMapAnchor2 = avitoMapAnchor;
            if ((i12 & 8) != 0) {
                f12 = Float.valueOf(0.0f);
            }
            Float f13 = f12;
            if ((i12 & 16) != 0) {
                z12 = true;
            }
            return avitoMap.addSameMarkers(list, bitmap, avitoMapAnchor2, f13, z12);
        }

        public static /* synthetic */ void distinctSameMoveEvent$default(AvitoMap avitoMap, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: distinctSameMoveEvent");
            }
            if ((i12 & 1) != 0) {
                z12 = false;
            }
            avitoMap.distinctSameMoveEvent(z12);
        }

        public static /* synthetic */ void moveTo$default(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint, boolean z12, Float f12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveTo");
            }
            if ((i12 & 4) != 0) {
                f12 = null;
            }
            avitoMap.moveTo(avitoMapPoint, z12, f12);
        }

        public static /* synthetic */ void moveToBounds$default(AvitoMap avitoMap, AvitoMapBounds avitoMapBounds, boolean z12, int i12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToBounds");
            }
            if ((i13 & 2) != 0) {
                z12 = true;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            avitoMap.moveToBounds(avitoMapBounds, z12, i12);
        }

        public static /* synthetic */ void moveToPointsWithPadding$default(AvitoMap avitoMap, List list, Integer num, ZoomOffset zoomOffset, boolean z12, Integer num2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToPointsWithPadding");
            }
            Integer num3 = (i12 & 2) != 0 ? null : num;
            ZoomOffset zoomOffset2 = (i12 & 4) != 0 ? null : zoomOffset;
            if ((i12 & 8) != 0) {
                z12 = true;
            }
            avitoMap.moveToPointsWithPadding(list, num3, zoomOffset2, z12, (i12 & 16) != 0 ? null : num2);
        }

        public static /* synthetic */ void moveToPointsWithPaddingCentered$default(AvitoMap avitoMap, List list, Integer num, boolean z12, Integer num2, AvitoMapPoint avitoMapPoint, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: moveToPointsWithPaddingCentered");
            }
            if ((i12 & 4) != 0) {
                z12 = true;
            }
            boolean z13 = z12;
            if ((i12 & 8) != 0) {
                num2 = null;
            }
            avitoMap.moveToPointsWithPaddingCentered(list, num, z13, num2, avitoMapPoint);
        }

        public static /* synthetic */ void onStop$default(AvitoMap avitoMap, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStop");
            }
            if ((i12 & 1) != 0) {
                z12 = true;
            }
            avitoMap.onStop(z12);
        }

        public static /* synthetic */ void removeMarker$default(AvitoMap avitoMap, AvitoMapMarker avitoMapMarker, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeMarker");
            }
            if ((i12 & 2) != 0) {
                z12 = false;
            }
            avitoMap.removeMarker(avitoMapMarker, z12);
        }

        public static /* synthetic */ void zoomIn$default(AvitoMap avitoMap, float f12, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomIn");
            }
            if ((i12 & 2) != 0) {
                z12 = false;
            }
            avitoMap.zoomIn(f12, z12);
        }

        public static /* synthetic */ void zoomOut$default(AvitoMap avitoMap, float f12, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomOut");
            }
            if ((i12 & 2) != 0) {
                z12 = false;
            }
            avitoMap.zoomOut(f12, z12);
        }

        public static /* synthetic */ void zoomTo$default(AvitoMap avitoMap, float f12, boolean z12, AnimationLength animationLength, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomTo");
            }
            if ((i12 & 2) != 0) {
                z12 = false;
            }
            if ((i12 & 4) != 0) {
                animationLength = AnimationLength.DEFAULT;
            }
            avitoMap.zoomTo(f12, z12, animationLength);
        }

        public static /* synthetic */ AvitoMapMarker addMarker$default(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint, AvitoMapMarker.Type type, AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, Float f12, int i12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
            }
            if ((i13 & 2) != 0) {
                type = AvitoMapMarker.Type.MARKER_PIN_DEFAULT;
            }
            AvitoMapMarker.Type type2 = type;
            if ((i13 & 4) != 0) {
                avitoMapAnchor = AvitoMapMarker.Anchor.CENTER;
            }
            AvitoMapMarker.AvitoMapAnchor avitoMapAnchor2 = avitoMapAnchor;
            if ((i13 & 8) != 0) {
                f12 = Float.valueOf(0.0f);
            }
            return avitoMap.addMarker(avitoMapPoint, type2, avitoMapAnchor2, f12, i12);
        }

        public static /* synthetic */ AvitoMapMarker addMarker$default(AvitoMap avitoMap, AvitoMapPoint avitoMapPoint, Bitmap bitmap, AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, Float f12, boolean z12, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
            }
            if ((i12 & 4) != 0) {
                avitoMapAnchor = AvitoMapMarker.Anchor.CENTER;
            }
            AvitoMapMarker.AvitoMapAnchor avitoMapAnchor2 = avitoMapAnchor;
            if ((i12 & 16) != 0) {
                z12 = true;
            }
            return avitoMap.addMarker(avitoMapPoint, bitmap, avitoMapAnchor2, f12, z12);
        }

        public static /* synthetic */ AvitoMapMarker addMarker$default(AvitoMap avitoMap, double d12, double d13, Bitmap bitmap, AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, float f12, String str, boolean z12, int i12, Object obj) {
            if (obj == null) {
                return avitoMap.addMarker(d12, d13, bitmap, (i12 & 8) != 0 ? AvitoMapMarker.Anchor.CENTER : avitoMapAnchor, f12, str, (i12 & 64) != 0 ? false : z12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addMarker");
        }
    }
}
