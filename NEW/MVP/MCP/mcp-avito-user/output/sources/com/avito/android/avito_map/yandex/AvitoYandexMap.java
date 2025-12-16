package com.avito.android.avito_map.yandex;

import Ba1.B;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import androidx.core.content.d;
import com.avito.android.avito_map.AvitoFittingBoundsBuilder;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapBoundsBuilder;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMarkerOptions;
import com.avito.android.avito_map.AvitoMapMoveReason;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.AvitoMapPolyline;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.avito.android.avito_map.R;
import com.avito.android.avito_map.ZoomOffset;
import com.avito.android.avito_map.alignment.AvitoMapHorizontalAlignment;
import com.avito.android.avito_map.alignment.AvitoMapVerticalAlignment;
import com.avito.android.util.V0;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.logo.Alignment;
import com.yandex.mapkit.logo.HorizontalAlignment;
import com.yandex.mapkit.logo.Logo;
import com.yandex.mapkit.logo.Padding;
import com.yandex.mapkit.logo.VerticalAlignment;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoYandexMap.kt */
@s0
@Metadata(d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u001eJC\u0010%\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b%\u0010&JC\u0010(\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b(\u0010)J9\u00100\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\t2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u00132\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00100\u001a\u00020/2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b0\u00104J9\u00100\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u00132\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00107JG\u0010<\u001a\b\u0012\u0004\u0012\u00020/0\u001f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u00132\u0006\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010=JU\u0010E\u001a\u00020D2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bE\u0010FJE\u0010I\u001a\u00020H2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f2\u0006\u0010G\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010JJ?\u0010M\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t2\u0006\u0010L\u001a\u00020\u0013H\u0016¢\u0006\u0004\bM\u0010NJ'\u0010Q\u001a\u00020/2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\bQ\u0010RJ?\u0010S\u001a\u00020/2\u0006\u0010O\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t2\u0006\u0010L\u001a\u00020\u0013H\u0016¢\u0006\u0004\bS\u0010NJ\u000f\u0010T\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010UJ;\u00100\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u00132\u0006\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u0010VJG\u00100\u001a\u00020/2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010:\u001a\u0002092\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0011H\u0016¢\u0006\u0004\b0\u0010ZJ\u001f\u0010_\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u001f\u0010c\u001a\u00020\u00152\u0006\u0010a\u001a\u00020\t2\u0006\u0010b\u001a\u00020\tH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010f\u001a\u00020\u00152\u0006\u0010e\u001a\u00020/2\u0006\u0010Y\u001a\u00020\u0011H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00152\u0006\u0010h\u001a\u00020DH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u00152\u0006\u0010k\u001a\u00020HH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ'\u0010s\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010u\u001a\u00020\u001cH\u0016¢\u0006\u0004\bu\u0010vJ\u0019\u0010x\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020wH\u0016¢\u0006\u0004\bx\u0010yJ\u0019\u0010{\u001a\u0004\u0018\u00010w2\u0006\u0010z\u001a\u00020\u000fH\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010~\u001a\u00020}H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u001e\u0010\u0082\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001e\u0010\u0085\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001e\u0010\u0088\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001e\u0010\u008b\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001e\u0010\u008e\u0001\u001a\u00020\u00152\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0090\u0001\u0010UJ\u0011\u0010\u0091\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0091\u0001\u0010UJ\u0011\u0010\u0092\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0092\u0001\u0010UJ\u0011\u0010\u0093\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0093\u0001\u0010UJ\u001b\u0010\u0095\u0001\u001a\u00020\u00152\u0007\u0010\u0094\u0001\u001a\u00020nH\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0097\u0001\u0010UJ\u001b\u0010\u0099\u0001\u001a\u00020\u00152\u0007\u0010\u0098\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u00152\u0007\u0010\u009b\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009e\u0001\u001a\u00020\u00152\u0007\u0010\u009b\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J\u001b\u0010 \u0001\u001a\u00020\u00152\u0007\u0010\u009f\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b \u0001\u0010\u009a\u0001J6\u0010¥\u0001\u001a\u00020\u00152\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\u0007\u0010£\u0001\u001a\u00020\t2\u0007\u0010¤\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J%\u0010¨\u0001\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010\u000f2\u0007\u0010§\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J,\u0010¬\u0001\u001a\u00020\u00152\u0007\u0010ª\u0001\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010«\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J#\u0010¯\u0001\u001a\u00020\u00152\u0007\u0010®\u0001\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J#\u0010±\u0001\u001a\u00020\u00152\u0007\u0010®\u0001\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0006\b±\u0001\u0010°\u0001J\u0011\u0010²\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b²\u0001\u0010UJ\u0015\u0010´\u0001\u001a\u00020\u0011*\u00030³\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0011\u0010¶\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b¶\u0001\u0010UJ\u0012\u0010·\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J$\u0010»\u0001\u001a\u00020\u00152\b\u0010º\u0001\u001a\u00030¹\u00012\u0006\u0010Y\u001a\u00020\u0011H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0011\u0010½\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b½\u0001\u0010UJ!\u0010f\u001a\u00020\u00152\u0007\u0010e\u001a\u00030¾\u00012\u0006\u0010Y\u001a\u00020\u0011H\u0002¢\u0006\u0005\bf\u0010¿\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ç\u0001\u001a\u00030Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R+\u0010Ë\u0001\u001a\u0016\u0012\u0005\u0012\u00030¾\u00010É\u0001j\n\u0012\u0005\u0012\u00030¾\u0001`Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u001f\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001f\u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ñ\u0001R\u001f\u0010Ó\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ñ\u0001R\u001f\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ñ\u0001R\u001f\u0010Õ\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ñ\u0001R\u0018\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ú\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010 \u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010Î\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010ã\u0001\u001a\u00030â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001¨\u0006ç\u0001"}, d2 = {"Lcom/avito/android/avito_map/yandex/AvitoYandexMap;", "Lcom/avito/android/avito_map/AvitoMap;", "Lcom/yandex/mapkit/mapview/MapView;", "mapView", "Landroid/content/Context;", "context", "<init>", "(Lcom/yandex/mapkit/mapview/MapView;Landroid/content/Context;)V", "Lkotlin/Q;", "", "getSize", "()Lkotlin/Q;", "Lcom/avito/android/avito_map/AvitoMapUiSettings;", "getUiSettings", "()Lcom/avito/android/avito_map/AvitoMapUiSettings;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "avitoMapPoint", "", "animate", "", "zoomLevel", "Lkotlin/G0;", "moveTo", "(Lcom/avito/android/avito_map/AvitoMapPoint;ZLjava/lang/Float;)V", "", "latitude", "longitude", "(DDZLjava/lang/Float;)V", "Lcom/avito/android/avito_map/AvitoMapBounds;", "avitoMapBounds", "(Lcom/avito/android/avito_map/AvitoMapBounds;Z)V", "", "points", "zoomPadding", "Lcom/avito/android/avito_map/ZoomOffset;", "zoomOffset", "mapHeight", "moveToPointsWithPadding", "(Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/avito_map/ZoomOffset;ZLjava/lang/Integer;)V", "centerPoint", "moveToPointsWithPaddingCentered", "(Ljava/util/List;Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/avito/android/avito_map/AvitoMapPoint;)V", "id", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "zIndex", "themeResId", "Lcom/avito/android/avito_map/AvitoMapMarker;", "addMarker", "(Lcom/avito/android/avito_map/AvitoMapPoint;ILcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;I)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarkerOptions;", "options", "(Lcom/avito/android/avito_map/AvitoMapMarkerOptions;)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarker$Type;", "type", "(Lcom/avito/android/avito_map/AvitoMapPoint;Lcom/avito/android/avito_map/AvitoMapMarker$Type;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;I)Lcom/avito/android/avito_map/AvitoMapMarker;", "avitoMapPoints", "Landroid/graphics/Bitmap;", "bitmap", "isVisible", "addSameMarkers", "(Ljava/util/List;Landroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;Z)Ljava/util/List;", "outlineColor", "outlineWidth", "strokeColor", "withGaps", "strokeWidth", "addToMemory", "Lcom/avito/android/avito_map/AvitoMapPolyline;", "addPolyline", "(Ljava/util/List;IFIZFFZ)Lcom/avito/android/avito_map/AvitoMapPolyline;", "fillColor", "Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "addPolygon", "(Ljava/util/List;IIFFZ)Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "radius", "width", "addCircle", "(Lcom/avito/android/avito_map/AvitoMapPoint;FFIIF)Lcom/avito/android/avito_map/AvitoMapMarker;", "point", "isApproximated", "addUserCoords", "(Lcom/avito/android/avito_map/AvitoMapPoint;ZI)Lcom/avito/android/avito_map/AvitoMapMarker;", "addApproximatedLocation", "clearDrawing", "()V", "(Lcom/avito/android/avito_map/AvitoMapPoint;Landroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;Z)Lcom/avito/android/avito_map/AvitoMapMarker;", "", "imageId", "withAnimation", "(DDLandroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;FLjava/lang/String;Z)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;", "horizontalAlignment", "Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;", "verticalAlignment", "setLogoAlignment", "(Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;)V", "verticalPadding", "horizontalPadding", "setLogoPadding", "(II)V", "marker", "removeMarker", "(Lcom/avito/android/avito_map/AvitoMapMarker;Z)V", "polyline", "removePolyline", "(Lcom/avito/android/avito_map/AvitoMapPolyline;)V", "polygon", "removePolygon", "(Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;)V", "Lcom/avito/android/avito_map/AvitoMapTarget;", "getMapTarget", "()Lcom/avito/android/avito_map/AvitoMapTarget;", "Lcom/avito/android/avito_map/AvitoMap$AnimationLength;", "animationLength", "zoomTo", "(FZLcom/avito/android/avito_map/AvitoMap$AnimationLength;)V", "getMapBounds", "()Lcom/avito/android/avito_map/AvitoMapBounds;", "Landroid/graphics/Point;", "fromScreenLocation", "(Landroid/graphics/Point;)Lcom/avito/android/avito_map/AvitoMapPoint;", "latLng", "toScreenLocation", "(Lcom/avito/android/avito_map/AvitoMapPoint;)Landroid/graphics/Point;", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "getMapCameraPosition", "()Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "listener", "addMoveStartListener", "(Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "addMoveEndListener", "(Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "addMapClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MapClickListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "addMarkerClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;", "addMarkerExactClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;)V", "clearMoveEndListeners", "clearMoveStartListeners", "clearMarkerClickListeners", "clearMapClickListeners", "target", "restoreTarget", "(Lcom/avito/android/avito_map/AvitoMapTarget;)V", "onStart", "clearAll", "onStop", "(Z)V", "zoomPreference", "setMaxZoomPreference", "(F)V", "setMinZoomPreference", "distinct", "distinctSameMoveEvent", "top", "right", "bottom", "left", "setPadding", "(IIII)V", "radiusInMeter", "moveToCircle", "(Lcom/avito/android/avito_map/AvitoMapPoint;F)V", "bounds", "boundsPadding", "moveToBounds", "(Lcom/avito/android/avito_map/AvitoMapBounds;ZI)V", "delta", "zoomOut", "(FZ)V", "zoomIn", "onLowMemory", "Landroid/content/res/Resources;", "isDarkTheme", "(Landroid/content/res/Resources;)Z", "clear", "getCurrentZoomLevel", "()F", "Lcom/yandex/mapkit/map/CameraPosition;", "cameraPosition", "moveToCameraPosition", "(Lcom/yandex/mapkit/map/CameraPosition;Z)V", "initDarkLightMode", "Lcom/yandex/mapkit/map/MapObject;", "(Lcom/yandex/mapkit/map/MapObject;Z)V", "Lcom/yandex/mapkit/mapview/MapView;", "getMapView", "()Lcom/yandex/mapkit/mapview/MapView;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/yandex/mapkit/map/MapObjectCollection;", "mapObjects", "Lcom/yandex/mapkit/map/MapObjectCollection;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "drawingMapObjects", "Ljava/util/ArrayList;", "cameraStartedMoving", "Z", "", "mapMoveStartListeners", "Ljava/util/List;", "mapMoveEndListeners", "mapClickListeners", "markerClickListeners", "markerExactClickListeners", "Lcom/yandex/mapkit/map/CameraListener;", "cameraListener", "Lcom/yandex/mapkit/map/CameraListener;", "Lcom/yandex/mapkit/map/InputListener;", "inputTapListener", "Lcom/yandex/mapkit/map/InputListener;", "Lcom/yandex/mapkit/Animation;", "animation", "Lcom/yandex/mapkit/Animation;", "Lcom/avito/android/avito_map/yandex/YandexAvitoMapCircle;", "approximatedLocationCircle", "Lcom/avito/android/avito_map/yandex/YandexAvitoMapCircle;", "Lcom/yandex/mapkit/map/MapObjectTapListener;", "tapListener", "Lcom/yandex/mapkit/map/MapObjectTapListener;", "lastCameraPosition", "Lcom/yandex/mapkit/map/CameraPosition;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoYandexMap implements AvitoMap {

    @l
    private YandexAvitoMapCircle approximatedLocationCircle;

    @k
    private final CameraListener cameraListener;

    @k
    private final Context context;
    private boolean distinctSameMoveEvent;

    @k
    private final InputListener inputTapListener;

    @l
    private CameraPosition lastCameraPosition;

    @k
    private final MapObjectCollection mapObjects;

    @k
    private final MapView mapView;

    @k
    private final ArrayList<MapObject> drawingMapObjects = new ArrayList<>();
    private boolean cameraStartedMoving = true;

    @k
    private final List<AvitoMap.MapMoveStartListener> mapMoveStartListeners = new ArrayList();

    @k
    private final List<AvitoMap.MapMoveEndListener> mapMoveEndListeners = new ArrayList();

    @k
    private final List<AvitoMap.MapClickListener> mapClickListeners = new ArrayList();

    @k
    private final List<AvitoMap.MarkerClickListener> markerClickListeners = new ArrayList();

    @k
    private final List<AvitoMap.MarkerExactClickListener> markerExactClickListeners = new ArrayList();

    @k
    private final Animation animation = new Animation(Animation.Type.SMOOTH, 0.125f);

    @k
    private final MapObjectTapListener tapListener = new MapObjectTapListener() { // from class: com.avito.android.avito_map.yandex.a
        @Override // com.yandex.mapkit.map.MapObjectTapListener
        public final boolean onMapObjectTap(MapObject mapObject, Point point) {
            return AvitoYandexMap.tapListener$lambda$3(this.f98073a, mapObject, point);
        }
    };

    /* compiled from: AvitoYandexMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CameraUpdateReason.values().length];
            try {
                iArr[CameraUpdateReason.GESTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraUpdateReason.APPLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AvitoMapHorizontalAlignment.values().length];
            try {
                iArr2[AvitoMapHorizontalAlignment.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AvitoMapHorizontalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AvitoMapHorizontalAlignment.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AvitoMapVerticalAlignment.values().length];
            try {
                iArr3[AvitoMapVerticalAlignment.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AvitoMapVerticalAlignment.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public AvitoYandexMap(@k MapView mapView, @k Context context) {
        this.mapView = mapView;
        this.context = context;
        this.mapObjects = mapView.getMapWindow().getMap().getMapObjects().addCollection();
        initDarkLightMode();
        CameraListener cameraListener = new CameraListener() { // from class: com.avito.android.avito_map.yandex.b
            @Override // com.yandex.mapkit.map.CameraListener
            public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z12) {
                AvitoYandexMap._init_$lambda$6(this.f98074a, map, cameraPosition, cameraUpdateReason, z12);
            }
        };
        this.cameraListener = cameraListener;
        InputListener inputListener = new InputListener() { // from class: com.avito.android.avito_map.yandex.AvitoYandexMap.2
            @Override // com.yandex.mapkit.map.InputListener
            public void onMapTap(@k Map map, @k Point point) {
                AvitoMapTarget avitoMapTarget = new AvitoMapTarget(new AvitoMapPoint(point.getLatitude(), point.getLongitude(), null, 4, null), AvitoYandexMap.this.getMapTarget().getZoomLevel());
                Iterator it = AvitoYandexMap.this.mapClickListeners.iterator();
                while (it.hasNext()) {
                    ((AvitoMap.MapClickListener) it.next()).onMapClicked(avitoMapTarget);
                }
            }

            @Override // com.yandex.mapkit.map.InputListener
            public void onMapLongTap(@k Map map, @k Point point) {
            }
        };
        this.inputTapListener = inputListener;
        mapView.getMapWindow().getMap().addCameraListener(cameraListener);
        mapView.getMapWindow().getMap().addInputListener(inputListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(AvitoYandexMap avitoYandexMap, Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z12) {
        YandexAvitoMapCircle yandexAvitoMapCircle;
        AvitoMapMoveReason avitoMapMoveReason;
        if (avitoYandexMap.cameraStartedMoving) {
            if (avitoYandexMap.distinctSameMoveEvent) {
                Point target = cameraPosition.getTarget();
                CameraPosition cameraPosition2 = avitoYandexMap.lastCameraPosition;
                if (AvitoYandexMapKt.equalsWithPrecision$default(target, cameraPosition2 != null ? cameraPosition2.getTarget() : null, 0.0d, 2, null)) {
                    float zoom = cameraPosition.getZoom();
                    CameraPosition cameraPosition3 = avitoYandexMap.lastCameraPosition;
                    if (L.b(zoom, cameraPosition3 != null ? Float.valueOf(cameraPosition3.getZoom()) : null)) {
                        return;
                    }
                }
            }
            avitoYandexMap.cameraStartedMoving = false;
            int i12 = WhenMappings.$EnumSwitchMapping$0[cameraUpdateReason.ordinal()];
            if (i12 == 1) {
                avitoMapMoveReason = AvitoMapMoveReason.GESTURE;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                avitoMapMoveReason = AvitoMapMoveReason.DEVELOPER_ANIMATION;
            }
            Iterator<T> it = avitoYandexMap.mapMoveStartListeners.iterator();
            while (it.hasNext()) {
                ((AvitoMap.MapMoveStartListener) it.next()).onMapMoveStarted(avitoMapMoveReason);
            }
        }
        float zoom2 = cameraPosition.getZoom();
        CameraPosition cameraPosition4 = avitoYandexMap.lastCameraPosition;
        if (!L.b(zoom2, cameraPosition4 != null ? Float.valueOf(cameraPosition4.getZoom()) : null) && (yandexAvitoMapCircle = avitoYandexMap.approximatedLocationCircle) != null) {
            yandexAvitoMapCircle.changeAlpha(avitoYandexMap.getMapTarget().getZoomLevel(), avitoYandexMap.isDarkTheme(avitoYandexMap.mapView.getContext().getResources()));
        }
        if (z12) {
            avitoYandexMap.cameraStartedMoving = true;
            Iterator<T> it2 = avitoYandexMap.mapMoveEndListeners.iterator();
            while (it2.hasNext()) {
                ((AvitoMap.MapMoveEndListener) it2.next()).onMapSettled(avitoYandexMap.getMapCameraPosition());
            }
            avitoYandexMap.lastCameraPosition = cameraPosition;
        }
    }

    private final void clear() {
        this.mapMoveStartListeners.clear();
        this.mapMoveEndListeners.clear();
        this.mapClickListeners.clear();
        this.markerClickListeners.clear();
        this.markerExactClickListeners.clear();
        this.mapObjects.clear();
        this.drawingMapObjects.clear();
    }

    private final float getCurrentZoomLevel() {
        return this.mapView.getMapWindow().getMap().getCameraPosition().getZoom();
    }

    private final void initDarkLightMode() {
        getUiSettings().isDarkModeEnabled(isDarkTheme(this.mapView.getContext().getResources()));
    }

    private final void moveToCameraPosition(CameraPosition cameraPosition, boolean withAnimation) {
        this.mapView.getMapWindow().getMap().move(cameraPosition, new Animation(Animation.Type.SMOOTH, withAnimation ? 0.5f : 0.0f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeMarker$lambda$42(MapObject mapObject, AvitoYandexMap avitoYandexMap) {
        mapObject.setVisible(false, avitoYandexMap.animation, null);
        avitoYandexMap.mapObjects.remove(mapObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tapListener$lambda$3(AvitoYandexMap avitoYandexMap, MapObject mapObject, Point point) {
        Iterator<T> it = avitoYandexMap.markerClickListeners.iterator();
        while (it.hasNext()) {
            ((AvitoMap.MarkerClickListener) it.next()).onMarkerClicked(mapObject.getUserData());
        }
        for (AvitoMap.MarkerExactClickListener markerExactClickListener : avitoYandexMap.markerExactClickListeners) {
            Object userData = mapObject.getUserData();
            YandexAvitoMapMarker yandexAvitoMapMarker = null;
            if (userData != null && (userData instanceof YandexAvitoMapMarker)) {
                yandexAvitoMapMarker = (YandexAvitoMapMarker) userData;
            }
            markerExactClickListener.onMarkerClicked(yandexAvitoMapMarker);
        }
        return true;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addApproximatedLocation(@k AvitoMapPoint point, float radius, float zIndex, int strokeColor, int fillColor, float width) {
        AvitoMapMarker avitoMapMarkerAddCircle = addCircle(point, radius, zIndex, strokeColor, fillColor, width);
        this.approximatedLocationCircle = avitoMapMarkerAddCircle instanceof YandexAvitoMapCircle ? (YandexAvitoMapCircle) avitoMapMarkerAddCircle : null;
        return avitoMapMarkerAddCircle;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addCircle(@k AvitoMapPoint avitoMapPoint, float radius, float zIndex, int strokeColor, int fillColor, float width) {
        CircleMapObject circleMapObjectAddCircle = this.mapObjects.addCircle(new Circle(AvitoYandexMapKt.toPoint(avitoMapPoint), radius));
        circleMapObjectAddCircle.setStrokeColor(strokeColor);
        circleMapObjectAddCircle.setStrokeWidth(width);
        circleMapObjectAddCircle.setFillColor(fillColor);
        circleMapObjectAddCircle.setZIndex(zIndex);
        return new YandexAvitoMapCircle(circleMapObjectAddCircle);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void addMapClickListener(@l AvitoMap.MapClickListener listener) {
        if (listener != null) {
            this.mapClickListeners.add(listener);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, int id2, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, int themeResId) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.mapView.getContext(), themeResId);
        PlacemarkMapObject placemarkMapObjectAddPlacemark = this.mapObjects.addPlacemark();
        placemarkMapObjectAddPlacemark.setGeometry(AvitoYandexMapKt.toPoint(avitoMapPoint));
        Drawable drawable = d.getDrawable(contextThemeWrapper, id2);
        placemarkMapObjectAddPlacemark.setIcon(ImageProvider.fromBitmap(drawable != null ? V0.b(drawable) : null, true, String.valueOf(id2)));
        placemarkMapObjectAddPlacemark.addTapListener(this.tapListener);
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(anchor.getX(), anchor.getY()));
        if (zIndex != null) {
            iconStyle.setZIndex(Float.valueOf(zIndex.floatValue()));
        }
        placemarkMapObjectAddPlacemark.setIconStyle(iconStyle);
        return new YandexAvitoMapMarker(placemarkMapObjectAddPlacemark);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void addMarkerClickListener(@l AvitoMap.MarkerClickListener listener) {
        if (listener != null) {
            this.markerClickListeners.add(listener);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void addMarkerExactClickListener(@l AvitoMap.MarkerExactClickListener listener) {
        if (listener != null) {
            this.markerExactClickListeners.add(listener);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void addMoveEndListener(@l AvitoMap.MapMoveEndListener listener) {
        if (listener != null) {
            this.mapMoveEndListeners.add(listener);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void addMoveStartListener(@l AvitoMap.MapMoveStartListener listener) {
        if (listener != null) {
            this.mapMoveStartListeners.add(listener);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapPolygon addPolygon(@k List<AvitoMapPoint> avitoMapPoints, int fillColor, int strokeColor, float strokeWidth, float zIndex, boolean addToMemory) {
        PolygonMapObject polygonMapObjectAddPolygon = this.mapObjects.addPolygon(new Polygon(new LinearRing(AvitoYandexMapKt.toPoints(avitoMapPoints)), new ArrayList()));
        polygonMapObjectAddPolygon.setStrokeColor(strokeColor);
        polygonMapObjectAddPolygon.setZIndex(zIndex);
        polygonMapObjectAddPolygon.setStrokeWidth(strokeWidth);
        polygonMapObjectAddPolygon.setFillColor(fillColor);
        YandexAvitoMapPolygon yandexAvitoMapPolygon = new YandexAvitoMapPolygon(polygonMapObjectAddPolygon);
        if (addToMemory) {
            this.drawingMapObjects.add(yandexAvitoMapPolygon.getPolygon());
        }
        return yandexAvitoMapPolygon;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapPolyline addPolyline(@k List<AvitoMapPoint> avitoMapPoints, int outlineColor, float outlineWidth, int strokeColor, boolean withGaps, float strokeWidth, float zIndex, boolean addToMemory) {
        PolylineMapObject polylineMapObjectAddPolyline = this.mapObjects.addPolyline(new Polyline(AvitoYandexMapKt.toPoints(avitoMapPoints)));
        polylineMapObjectAddPolyline.setOutlineColor(outlineColor);
        polylineMapObjectAddPolyline.setOutlineWidth(outlineWidth);
        polylineMapObjectAddPolyline.setStrokeColor(strokeColor);
        polylineMapObjectAddPolyline.setStrokeWidth(strokeWidth);
        if (withGaps) {
            polylineMapObjectAddPolyline.setGapLength(4.0f);
            polylineMapObjectAddPolyline.setDashLength(12.0f);
        }
        polylineMapObjectAddPolyline.setZIndex(zIndex);
        YandexAvitoMapPolyline yandexAvitoMapPolyline = new YandexAvitoMapPolyline(polylineMapObjectAddPolyline);
        if (addToMemory) {
            this.drawingMapObjects.add(yandexAvitoMapPolyline.getPolyline());
        }
        return yandexAvitoMapPolyline;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public List<AvitoMapMarker> addSameMarkers(@k List<AvitoMapPoint> avitoMapPoints, @l Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, boolean isVisible) {
        List<AvitoMapPoint> list = avitoMapPoints;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(addMarker((AvitoMapPoint) it.next(), bitmap, anchor, zIndex, isVisible));
        }
        return arrayList;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addUserCoords(@k AvitoMapPoint point, boolean isApproximated, int themeResId) {
        if (!isApproximated) {
            return addMarker(point, AvitoMapMarker.Type.MARKER_MY_LOCATION_RED, AvitoMapMarker.Anchor.CENTER, Float.valueOf(8.0f), themeResId);
        }
        AvitoMapMarker avitoMapMarkerAddCircle = addCircle(point, 3000.0f, 2000.0f, d.getColor(this.context, R.color.stroke_black), d.getColor(this.context, R.color.fill_black), 1.0f);
        this.approximatedLocationCircle = avitoMapMarkerAddCircle instanceof YandexAvitoMapCircle ? (YandexAvitoMapCircle) avitoMapMarkerAddCircle : null;
        return avitoMapMarkerAddCircle;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void clearDrawing() {
        Iterator<MapObject> it = this.drawingMapObjects.iterator();
        while (it.hasNext()) {
            this.mapObjects.remove(it.next());
        }
        this.drawingMapObjects.clear();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void clearMapClickListeners() {
        this.mapClickListeners.clear();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void clearMarkerClickListeners() {
        this.markerClickListeners.clear();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void clearMoveEndListeners() {
        this.mapMoveEndListeners.clear();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void clearMoveStartListeners() {
        this.mapMoveStartListeners.clear();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void distinctSameMoveEvent(boolean distinct) {
        this.distinctSameMoveEvent = distinct;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @l
    public AvitoMapPoint fromScreenLocation(@k android.graphics.Point point) {
        Point pointScreenToWorld = this.mapView.getMapWindow().screenToWorld(new ScreenPoint(point.x, point.y));
        if (pointScreenToWorld != null) {
            return AvitoYandexMapKt.toAvitoMapPoint(pointScreenToWorld);
        }
        return null;
    }

    @k
    public final Context getContext() {
        return this.context;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapBounds getMapBounds() {
        return AvitoYandexMapKt.toAvitoMapBounds(this.mapView.getMapWindow().getMap().getVisibleRegion());
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapCameraPosition getMapCameraPosition() {
        CameraPosition cameraPosition = this.mapView.getMapWindow().getMap().getCameraPosition();
        return new AvitoMapCameraPosition(AvitoYandexMapKt.toAvitoMapPoint(cameraPosition.getTarget()), cameraPosition.getZoom(), cameraPosition.getTilt(), Float.valueOf(cameraPosition.getAzimuth()), getMapBounds());
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapTarget getMapTarget() {
        return new AvitoMapTarget(AvitoYandexMapKt.toAvitoMapPoint(this.mapView.getMapWindow().getMap().getCameraPosition().getTarget()), this.mapView.getMapWindow().getMap().getCameraPosition().getZoom());
    }

    @k
    public final MapView getMapView() {
        return this.mapView;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public Q<Integer, Integer> getSize() {
        return new Q<>(Integer.valueOf(this.mapView.getWidth()), Integer.valueOf(this.mapView.getHeight()));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapUiSettings getUiSettings() {
        return new YandexAvitoMapUiSettings(this.mapView.getMapWindow().getMap());
    }

    public final boolean isDarkTheme(@k Resources resources) {
        return (resources.getConfiguration().uiMode & 48) == 32;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveTo(@k AvitoMapPoint avitoMapPoint, boolean animate, @l Float zoomLevel) {
        moveToCameraPosition(new CameraPosition(AvitoYandexMapKt.toPoint(avitoMapPoint), zoomLevel != null ? zoomLevel.floatValue() : getCurrentZoomLevel(), this.mapView.getMapWindow().getMap().getCameraPosition().getAzimuth(), this.mapView.getMapWindow().getMap().getCameraPosition().getTilt()), animate);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToBounds(@k AvitoMapBounds bounds, boolean animate, int boundsPadding) {
        this.mapView.getMapWindow().getMap().move(this.mapView.getMapWindow().getMap().cameraPosition(Geometry.fromBoundingBox(AvitoYandexMapKt.toBoundingBox(bounds))), new Animation(Animation.Type.SMOOTH, animate ? 0.5f : 0.0f), null);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToCircle(@l AvitoMapPoint centerPoint, float radiusInMeter) {
        Point point;
        Geometry geometryFromCircle = (centerPoint == null || (point = AvitoYandexMapKt.toPoint(centerPoint)) == null) ? null : Geometry.fromCircle(new Circle(point, (float) (radiusInMeter * 1.1d)));
        if (geometryFromCircle != null) {
            this.mapView.getMapWindow().getMap().move(this.mapView.getMapWindow().getMap().cameraPosition(geometryFromCircle));
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToPointsWithPadding(@k List<AvitoMapPoint> points, @l Integer zoomPadding, @l ZoomOffset zoomOffset, boolean animate, @l Integer mapHeight) {
        AvitoMapBoundsBuilder avitoMapBoundsBuilder = new AvitoMapBoundsBuilder(this.mapView.getMapWindow().width(), mapHeight != null ? mapHeight.intValue() : this.mapView.getMapWindow().height());
        Iterator<T> it = points.iterator();
        while (it.hasNext()) {
            avitoMapBoundsBuilder.addPoint((AvitoMapPoint) it.next());
        }
        if (zoomPadding != null) {
            avitoMapBoundsBuilder.addOffset(zoomPadding.intValue());
        }
        if (zoomOffset != null) {
            avitoMapBoundsBuilder.addOffset(zoomOffset);
        }
        AvitoMapBounds avitoMapBoundsBuild = avitoMapBoundsBuilder.build();
        BoundingBox boundingBox = avitoMapBoundsBuild != null ? AvitoYandexMapKt.toBoundingBox(avitoMapBoundsBuild) : null;
        if (boundingBox != null) {
            this.mapView.getMapWindow().getMap().move(this.mapView.getMapWindow().getMap().cameraPosition(Geometry.fromBoundingBox(boundingBox)), new Animation(Animation.Type.SMOOTH, animate ? 0.5f : 0.0f), null);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToPointsWithPaddingCentered(@k List<AvitoMapPoint> points, @l Integer zoomPadding, boolean animate, @l Integer mapHeight, @l AvitoMapPoint centerPoint) {
        this.mapView.getMapWindow().getMap().move(this.mapView.getMapWindow().getMap().cameraPosition(Geometry.fromBoundingBox(AvitoYandexMapKt.toBoundingBox(new AvitoFittingBoundsBuilder(points).setCenterPoint(centerPoint).build()))), new Animation(Animation.Type.SMOOTH, animate ? 0.5f : 0.0f), null);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void onLowMemory() {
        this.mapView.onMemoryWarning();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void onStart() {
        this.mapView.onStart();
        MapKitFactory.getInstance().onStart();
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void onStop(boolean clearAll) {
        this.mapView.onStop();
        MapKitFactory.getInstance().onStop();
        if (clearAll) {
            clear();
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void removeMarker(@k AvitoMapMarker marker, boolean withAnimation) {
        if (marker instanceof YandexAvitoMapMarker) {
            removeMarker(((YandexAvitoMapMarker) marker).getPlaceMark(), withAnimation);
        } else if (marker instanceof YandexAvitoMapCircle) {
            removeMarker(((YandexAvitoMapCircle) marker).getCircle(), withAnimation);
            this.approximatedLocationCircle = null;
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void removePolygon(@k AvitoMapPolygon polygon) {
        if (polygon instanceof YandexAvitoMapPolygon) {
            YandexAvitoMapPolygon yandexAvitoMapPolygon = (YandexAvitoMapPolygon) polygon;
            this.mapObjects.remove(yandexAvitoMapPolygon.getPolygon());
            this.drawingMapObjects.remove(yandexAvitoMapPolygon.getPolygon());
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void removePolyline(@k AvitoMapPolyline polyline) {
        if (polyline instanceof YandexAvitoMapPolyline) {
            YandexAvitoMapPolyline yandexAvitoMapPolyline = (YandexAvitoMapPolyline) polyline;
            this.mapObjects.remove(yandexAvitoMapPolyline.getPolyline());
            this.drawingMapObjects.remove(yandexAvitoMapPolyline.getPolyline());
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void restoreTarget(@k AvitoMapTarget target) {
        moveTo(target.getPoint(), false, Float.valueOf(target.getZoomLevel()));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setLogoAlignment(@k AvitoMapHorizontalAlignment horizontalAlignment, @k AvitoMapVerticalAlignment verticalAlignment) {
        HorizontalAlignment horizontalAlignment2;
        VerticalAlignment verticalAlignment2;
        Logo logo = this.mapView.getMapWindow().getMap().getLogo();
        int i12 = WhenMappings.$EnumSwitchMapping$1[horizontalAlignment.ordinal()];
        if (i12 == 1) {
            horizontalAlignment2 = HorizontalAlignment.RIGHT;
        } else if (i12 == 2) {
            horizontalAlignment2 = HorizontalAlignment.CENTER;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            horizontalAlignment2 = HorizontalAlignment.LEFT;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$2[verticalAlignment.ordinal()];
        if (i13 == 1) {
            verticalAlignment2 = VerticalAlignment.BOTTOM;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalAlignment2 = VerticalAlignment.TOP;
        }
        logo.setAlignment(new Alignment(horizontalAlignment2, verticalAlignment2));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setLogoPadding(int verticalPadding, int horizontalPadding) {
        this.mapView.getMapWindow().getMap().getLogo().setPadding(new Padding(horizontalPadding, verticalPadding));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setMaxZoomPreference(float zoomPreference) {
        this.mapView.getMapWindow().getMap().getCameraBounds().setMaxZoomPreference(zoomPreference);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setMinZoomPreference(float zoomPreference) {
        this.mapView.getMapWindow().getMap().getCameraBounds().setMinZoomPreference(zoomPreference);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @l
    public android.graphics.Point toScreenLocation(@k AvitoMapPoint latLng) {
        ScreenPoint screenPointWorldToScreen = this.mapView.getMapWindow().worldToScreen(new Point(latLng.getLatitude(), latLng.getLongitude()));
        if (screenPointWorldToScreen == null) {
            return null;
        }
        return new android.graphics.Point((int) screenPointWorldToScreen.getX(), (int) screenPointWorldToScreen.getY());
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void zoomIn(float delta, boolean animate) {
        AvitoMap.DefaultImpls.zoomTo$default(this, getMapTarget().getZoomLevel() + delta, animate, null, 4, null);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void zoomOut(float delta, boolean animate) {
        AvitoMap.DefaultImpls.zoomTo$default(this, getMapTarget().getZoomLevel() - delta, animate, null, 4, null);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void zoomTo(float zoomLevel, boolean animate, @k AvitoMap.AnimationLength animationLength) {
        float yandexMapAnimationLength = AvitoYandexMapKt.toYandexMapAnimationLength(animationLength);
        Animation.Type type = Animation.Type.SMOOTH;
        if (!animate) {
            yandexMapAnimationLength = 0.0f;
        }
        this.mapView.getMapWindow().getMap().move(AvitoYandexMapKt.toYandexCameraPosition(AvitoMapCameraPosition.copy$default(getMapCameraPosition(), null, zoomLevel, 0.0f, null, null, 29, null)), new Animation(type, yandexMapAnimationLength), new com.avito.android.authorization.auto_recovery.phone_confirm.b(14));
    }

    private final void removeMarker(MapObject marker, boolean withAnimation) {
        if (withAnimation) {
            marker.setVisible(false, this.animation, new B(24, marker, this));
        } else {
            this.mapObjects.remove(marker);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveTo(double latitude, double longitude, boolean animate, @l Float zoomLevel) {
        moveToCameraPosition(new CameraPosition(new Point(latitude, longitude), zoomLevel != null ? zoomLevel.floatValue() : getCurrentZoomLevel(), this.mapView.getMapWindow().getMap().getCameraPosition().getAzimuth(), this.mapView.getMapWindow().getMap().getCameraPosition().getTilt()), animate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMarker$lambda$29$lambda$27() {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapMarkerOptions options) {
        PlacemarkMapObject placemarkMapObjectAddPlacemark = this.mapObjects.addPlacemark();
        placemarkMapObjectAddPlacemark.setGeometry(AvitoYandexMapKt.toPoint(options.getPosition()));
        placemarkMapObjectAddPlacemark.setIcon(ImageProvider.fromBitmap(options.getIcon()));
        placemarkMapObjectAddPlacemark.addTapListener(this.tapListener);
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(options.getAnchor().getX(), options.getAnchor().getY()));
        Float zIndex = iconStyle.getZIndex();
        if (zIndex != null) {
            iconStyle.setZIndex(zIndex);
        }
        placemarkMapObjectAddPlacemark.setIconStyle(iconStyle);
        YandexAvitoMapMarker yandexAvitoMapMarker = new YandexAvitoMapMarker(placemarkMapObjectAddPlacemark);
        yandexAvitoMapMarker.setData(yandexAvitoMapMarker);
        return yandexAvitoMapMarker;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveTo(@k AvitoMapBounds avitoMapBounds, boolean animate) {
        moveToCameraPosition(this.mapView.getMapWindow().getMap().cameraPosition(Geometry.fromBoundingBox(AvitoYandexMapKt.toBoundingBox(avitoMapBounds))), animate);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @k AvitoMapMarker.Type type, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, int themeResId) {
        return addMarker(avitoMapPoint, type.getDrawableRes(), anchor, zIndex, themeResId);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @l Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, boolean isVisible) {
        PlacemarkMapObject placemarkMapObjectAddPlacemark = this.mapObjects.addPlacemark();
        placemarkMapObjectAddPlacemark.setGeometry(AvitoYandexMapKt.toPoint(avitoMapPoint));
        placemarkMapObjectAddPlacemark.setIcon(ImageProvider.fromBitmap(bitmap));
        placemarkMapObjectAddPlacemark.addTapListener(this.tapListener);
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(anchor.getX(), anchor.getY()));
        if (zIndex != null) {
            iconStyle.setZIndex(Float.valueOf(zIndex.floatValue()));
        }
        placemarkMapObjectAddPlacemark.setIconStyle(iconStyle);
        placemarkMapObjectAddPlacemark.setVisible(isVisible);
        return new YandexAvitoMapMarker(placemarkMapObjectAddPlacemark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoomTo$lambda$30(boolean z12) {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(double latitude, double longitude, @k Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, float zIndex, @k String imageId, boolean withAnimation) {
        PlacemarkMapObject placemarkMapObjectAddPlacemark = this.mapObjects.addPlacemark();
        placemarkMapObjectAddPlacemark.setGeometry(new Point(latitude, longitude));
        placemarkMapObjectAddPlacemark.setIcon(new YandexAvitoMapImageProvider(bitmap, imageId));
        if (withAnimation) {
            placemarkMapObjectAddPlacemark.setVisible(false);
            placemarkMapObjectAddPlacemark.setVisible(true, this.animation, new com.avito.android.authorization.auto_recovery.phone_confirm.b(13));
        }
        placemarkMapObjectAddPlacemark.addTapListener(this.tapListener);
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(anchor.getX(), anchor.getY()));
        iconStyle.setZIndex(Float.valueOf(zIndex));
        placemarkMapObjectAddPlacemark.setIconStyle(iconStyle);
        return new YandexAvitoMapMarker(placemarkMapObjectAddPlacemark);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setPadding(int top, int right, int bottom, int left) {
    }
}
