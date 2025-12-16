package com.avito.android.avito_map.google;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.TypedValue;
import androidx.core.content.res.i;
import androidx.core.graphics.drawable.d;
import com.avito.android.avito_map.AvitoFittingBoundsBuilder;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
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
import com.avito.android.avito_map.yandex.AvitoMapPolygon;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.C36804a;
import com.google.android.gms.maps.C36805b;
import com.google.android.gms.maps.C36806c;
import com.google.android.gms.maps.model.C36818b;
import com.google.android.gms.maps.model.C36819c;
import com.google.android.gms.maps.model.C36824h;
import com.google.android.gms.maps.model.C36825i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.j;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import tg.C48666a;

/* compiled from: AvitoGoogleMap.kt */
@s0
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u001eJ'\u0010!\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J9\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b)\u0010-J9\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u00100JG\u00106\u001a\b\u0012\u0004\u0012\u00020(012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u00107JU\u0010?\u001a\u00020>2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010@JE\u0010C\u001a\u00020B2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u0006\u0010A\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\bC\u0010DJ?\u0010G\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010F\u001a\u00020\u0013H\u0016¢\u0006\u0004\bG\u0010HJ'\u0010K\u001a\u00020(2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010LJ?\u0010M\u001a\u00020(2\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010F\u001a\u00020\u0013H\u0016¢\u0006\u0004\bM\u0010HJ;\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00132\u0006\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010NJG\u0010)\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010RJ\u001f\u0010T\u001a\u00020\u00152\u0006\u0010S\u001a\u00020(2\u0006\u0010Q\u001a\u00020\u0011H\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00152\u0006\u0010V\u001a\u00020>H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020BH\u0016¢\u0006\u0004\bZ\u0010[JC\u0010a\u001a\u00020\u00152\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010]\u001a\u0004\u0018\u00010\t2\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010`\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\ba\u0010bJC\u0010d\u001a\u00020\u00152\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010]\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010`\u001a\u0004\u0018\u00010\t2\b\u0010c\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bd\u0010eJ'\u0010h\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\tH\u0016¢\u0006\u0004\bh\u0010iJ!\u0010k\u001a\u00020\u00152\b\u0010c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010j\u001a\u00020\u0013H\u0016¢\u0006\u0004\bk\u0010lJ\u001f\u0010n\u001a\u00020\u00152\u0006\u0010m\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bn\u0010oJ\u001f\u0010p\u001a\u00020\u00152\u0006\u0010m\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bp\u0010oJ\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u001cH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020vH\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020v2\u0006\u0010y\u001a\u00020\u000fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010}\u001a\u00020|H\u0016¢\u0006\u0004\b}\u0010~J\u001d\u0010\u0081\u0001\u001a\u00020\u00152\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007fH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001e\u0010\u0084\u0001\u001a\u00020\u00152\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0083\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001e\u0010\u0087\u0001\u001a\u00020\u00152\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0012\u0010\u0089\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0012\u0010\u008b\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008a\u0001J\u0012\u0010\u008d\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u00152\u0007\u0010\u008e\u0001\u001a\u00020qH\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00152\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\u00152\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u0099\u0001\u001a\u00020\u00152\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00020\u00152\u0007\u0010\u009b\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009e\u0001\u001a\u00020\u00152\u0007\u0010\u009b\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J&\u0010£\u0001\u001a\u00020\u00152\b\u0010 \u0001\u001a\u00030\u009f\u00012\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J$\u0010§\u0001\u001a\u00020\u00152\u0007\u0010¥\u0001\u001a\u00020\t2\u0007\u0010¦\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001b\u0010ª\u0001\u001a\u00020\u00152\u0007\u0010©\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\bª\u0001\u0010\u0094\u0001J6\u0010¯\u0001\u001a\u00020\u00152\u0007\u0010«\u0001\u001a\u00020\t2\u0007\u0010¬\u0001\u001a\u00020\t2\u0007\u0010\u00ad\u0001\u001a\u00020\t2\u0007\u0010®\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0012\u0010±\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b±\u0001\u0010\u008a\u0001J\u0012\u0010²\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0006\b²\u0001\u0010\u008a\u0001J\u0015\u0010´\u0001\u001a\u00020\u0011*\u00030³\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J$\u0010¸\u0001\u001a\u00020\u00152\b\u0010·\u0001\u001a\u00030¶\u00012\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0012\u0010º\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0006\bº\u0001\u0010\u008a\u0001J\u001c\u0010»\u0001\u001a\u0002032\b\b\u0001\u0010#\u001a\u00020\tH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010½\u0001R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R\u001f\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001e\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u007f0Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R\u001f\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Ã\u0001R\u001f\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ã\u0001R\u001f\u0010Ç\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010Ã\u0001¨\u0006È\u0001"}, d2 = {"Lcom/avito/android/avito_map/google/AvitoGoogleMap;", "Lcom/avito/android/avito_map/AvitoMap;", "Lcom/google/android/gms/maps/c;", "map", "Landroid/content/Context;", "context", "<init>", "(Lcom/google/android/gms/maps/c;Landroid/content/Context;)V", "Lkotlin/Q;", "", "getSize", "()Lkotlin/Q;", "Lcom/avito/android/avito_map/AvitoMapUiSettings;", "getUiSettings", "()Lcom/avito/android/avito_map/AvitoMapUiSettings;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "avitoMapPoint", "", "animate", "", "zoomLevel", "Lkotlin/G0;", "moveTo", "(Lcom/avito/android/avito_map/AvitoMapPoint;ZLjava/lang/Float;)V", "", "latitude", "longitude", "(DDZLjava/lang/Float;)V", "Lcom/avito/android/avito_map/AvitoMapBounds;", "avitoMapBounds", "(Lcom/avito/android/avito_map/AvitoMapBounds;Z)V", "Lcom/avito/android/avito_map/AvitoMap$AnimationLength;", "animationLength", "zoomTo", "(FZLcom/avito/android/avito_map/AvitoMap$AnimationLength;)V", "id", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "zIndex", "themeResId", "Lcom/avito/android/avito_map/AvitoMapMarker;", "addMarker", "(Lcom/avito/android/avito_map/AvitoMapPoint;ILcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;I)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarkerOptions;", "options", "(Lcom/avito/android/avito_map/AvitoMapMarkerOptions;)Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/avito/android/avito_map/AvitoMapMarker$Type;", "type", "(Lcom/avito/android/avito_map/AvitoMapPoint;Lcom/avito/android/avito_map/AvitoMapMarker$Type;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;I)Lcom/avito/android/avito_map/AvitoMapMarker;", "", "avitoMapPoints", "Landroid/graphics/Bitmap;", "bitmap", "isVisible", "addSameMarkers", "(Ljava/util/List;Landroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;Z)Ljava/util/List;", "outlineColor", "outlineWidth", "strokeColor", "withGaps", "strokeWidth", "addToMemory", "Lcom/avito/android/avito_map/AvitoMapPolyline;", "addPolyline", "(Ljava/util/List;IFIZFFZ)Lcom/avito/android/avito_map/AvitoMapPolyline;", "fillColor", "Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "addPolygon", "(Ljava/util/List;IIFFZ)Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "radius", "width", "addCircle", "(Lcom/avito/android/avito_map/AvitoMapPoint;FFIIF)Lcom/avito/android/avito_map/AvitoMapMarker;", "point", "isApproximated", "addUserCoords", "(Lcom/avito/android/avito_map/AvitoMapPoint;ZI)Lcom/avito/android/avito_map/AvitoMapMarker;", "addApproximatedLocation", "(Lcom/avito/android/avito_map/AvitoMapPoint;Landroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;Ljava/lang/Float;Z)Lcom/avito/android/avito_map/AvitoMapMarker;", "", "imageId", "withAnimation", "(DDLandroid/graphics/Bitmap;Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;FLjava/lang/String;Z)Lcom/avito/android/avito_map/AvitoMapMarker;", "marker", "removeMarker", "(Lcom/avito/android/avito_map/AvitoMapMarker;Z)V", "polyline", "removePolyline", "(Lcom/avito/android/avito_map/AvitoMapPolyline;)V", "polygon", "removePolygon", "(Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;)V", "points", "zoomPadding", "Lcom/avito/android/avito_map/ZoomOffset;", "zoomOffset", "mapHeight", "moveToPointsWithPadding", "(Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/avito_map/ZoomOffset;ZLjava/lang/Integer;)V", "centerPoint", "moveToPointsWithPaddingCentered", "(Ljava/util/List;Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/avito/android/avito_map/AvitoMapPoint;)V", "bounds", "boundsPadding", "moveToBounds", "(Lcom/avito/android/avito_map/AvitoMapBounds;ZI)V", "radiusInMeter", "moveToCircle", "(Lcom/avito/android/avito_map/AvitoMapPoint;F)V", "delta", "zoomOut", "(FZ)V", "zoomIn", "Lcom/avito/android/avito_map/AvitoMapTarget;", "getMapTarget", "()Lcom/avito/android/avito_map/AvitoMapTarget;", "getMapBounds", "()Lcom/avito/android/avito_map/AvitoMapBounds;", "Landroid/graphics/Point;", "fromScreenLocation", "(Landroid/graphics/Point;)Lcom/avito/android/avito_map/AvitoMapPoint;", "latLng", "toScreenLocation", "(Lcom/avito/android/avito_map/AvitoMapPoint;)Landroid/graphics/Point;", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "getMapCameraPosition", "()Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;", "listener", "addMoveEndListener", "(Lcom/avito/android/avito_map/AvitoMap$MapMoveEndListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;", "addMoveStartListener", "(Lcom/avito/android/avito_map/AvitoMap$MapMoveStartListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MapClickListener;", "addMapClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MapClickListener;)V", "clearMarkerClickListeners", "()V", "clearMapClickListeners", "clearMoveEndListeners", "clearMoveStartListeners", "target", "restoreTarget", "(Lcom/avito/android/avito_map/AvitoMapTarget;)V", "onStart", "clearAll", "onStop", "(Z)V", "Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;", "addMarkerClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MarkerClickListener;)V", "Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;", "addMarkerExactClickListener", "(Lcom/avito/android/avito_map/AvitoMap$MarkerExactClickListener;)V", "zoomPreference", "setMaxZoomPreference", "(F)V", "setMinZoomPreference", "Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;", "horizontalAlignment", "Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;", "verticalAlignment", "setLogoAlignment", "(Lcom/avito/android/avito_map/alignment/AvitoMapHorizontalAlignment;Lcom/avito/android/avito_map/alignment/AvitoMapVerticalAlignment;)V", "verticalPadding", "horizontalPadding", "setLogoPadding", "(II)V", "distinct", "distinctSameMoveEvent", "top", "right", "bottom", "left", "setPadding", "(IIII)V", "onLowMemory", "clearDrawing", "Landroid/content/res/Resources;", "isDarkTheme", "(Landroid/content/res/Resources;)Z", "Lcom/google/android/gms/maps/a;", "updateFactory", "updateMap", "(Lcom/google/android/gms/maps/a;Z)V", "initDarkLightMode", "vectorResToBitmap", "(I)Landroid/graphics/Bitmap;", "Lcom/google/android/gms/maps/c;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "mapMoveStartListeners", "Ljava/util/List;", "mapMoveEndListeners", "mapClickListeners", "markerClickListeners", "markerExactClickListeners", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoGoogleMap implements AvitoMap {

    @k
    private final Context context;

    @k
    private final C36806c map;

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

    public AvitoGoogleMap(@k C36806c c36806c, @k Context context) {
        this.map = c36806c;
        this.context = context;
        initDarkLightMode();
        c36806c.f(new C48666a(this));
        c36806c.g(new C48666a(this));
        c36806c.h(new C48666a(this));
        c36806c.i(new C48666a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AvitoGoogleMap avitoGoogleMap) {
        AvitoMapCameraPosition mapCameraPosition = avitoGoogleMap.getMapCameraPosition();
        Iterator<T> it = avitoGoogleMap.mapMoveEndListeners.iterator();
        while (it.hasNext()) {
            ((AvitoMap.MapMoveEndListener) it.next()).onMapSettled(mapCameraPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(AvitoGoogleMap avitoGoogleMap, int i12) {
        AvitoMapMoveReason avitoMapMoveReason = i12 != 1 ? i12 != 2 ? i12 != 3 ? AvitoMapMoveReason.UNKNOWN : AvitoMapMoveReason.DEVELOPER_ANIMATION : AvitoMapMoveReason.API_ANIMATION : AvitoMapMoveReason.GESTURE;
        Iterator<T> it = avitoGoogleMap.mapMoveStartListeners.iterator();
        while (it.hasNext()) {
            ((AvitoMap.MapMoveStartListener) it.next()).onMapMoveStarted(avitoMapMoveReason);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(AvitoGoogleMap avitoGoogleMap, LatLng latLng) {
        Iterator<T> it = avitoGoogleMap.mapClickListeners.iterator();
        while (it.hasNext()) {
            ((AvitoMap.MapClickListener) it.next()).onMapClicked(new AvitoMapTarget(new AvitoMapPoint(latLng.f354407b, latLng.f354408c, null, 4, null), avitoGoogleMap.getMapTarget().getZoomLevel()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$9(AvitoGoogleMap avitoGoogleMap, C36824h c36824h) throws SecurityException {
        c36824h.getClass();
        try {
            Object objG4 = f.g4(c36824h.f354490a.zzk());
            if (objG4 == null) {
                return true;
            }
            Iterator<T> it = avitoGoogleMap.markerClickListeners.iterator();
            while (it.hasNext()) {
                ((AvitoMap.MarkerClickListener) it.next()).onMarkerClicked(objG4);
            }
            GoogleAvitoMapMarker googleAvitoMapMarker = objG4 instanceof GoogleAvitoMapMarker ? (GoogleAvitoMapMarker) objG4 : null;
            Iterator<T> it2 = avitoGoogleMap.markerExactClickListeners.iterator();
            while (it2.hasNext()) {
                ((AvitoMap.MarkerExactClickListener) it2.next()).onMarkerClicked(googleAvitoMapMarker);
            }
            return true;
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    private final void initDarkLightMode() {
        getUiSettings().isDarkModeEnabled(isDarkTheme(this.context.getResources()));
    }

    private final void updateMap(C36804a updateFactory, boolean withAnimation) {
        if (withAnimation) {
            this.map.b(updateFactory);
        } else {
            this.map.e(updateFactory);
        }
    }

    private final Bitmap vectorResToBitmap(@InterfaceC42165v int id2) throws Resources.NotFoundException {
        Resources resources = this.context.getResources();
        Resources.Theme theme = this.context.getTheme();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        Drawable drawable = resources.getDrawable(id2, theme);
        return d.a(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addApproximatedLocation(@k AvitoMapPoint point, float radius, float zIndex, int strokeColor, int fillColor, float width) {
        return addCircle(point, radius, zIndex, strokeColor, fillColor, width);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addCircle(@k AvitoMapPoint avitoMapPoint, float radius, float zIndex, int strokeColor, int fillColor, float width) {
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.f354386b = avitoMapPoint.toLatLng();
        circleOptions.f354387c = radius;
        circleOptions.f354390f = fillColor;
        circleOptions.f354389e = strokeColor;
        circleOptions.f354388d = width;
        circleOptions.f354391g = zIndex;
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            return new GoogleAvitoMapCircle(new C36819c(c36806c.f354354a.w(circleOptions)));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
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
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.f354419e = C36818b.a(vectorResToBitmap(id2));
        markerOptions.f354416b = new LatLng(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude());
        C36824h c36824hA = this.map.a(markerOptions);
        c36824hA.a(anchor.getX(), anchor.getY());
        if (zIndex != null) {
            c36824hA.b(zIndex.floatValue());
        }
        GoogleAvitoMapMarker googleAvitoMapMarker = new GoogleAvitoMapMarker(c36824hA);
        googleAvitoMapMarker.setData(googleAvitoMapMarker);
        return googleAvitoMapMarker;
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
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.f354439f = fillColor;
        polygonOptions.f354438e = strokeColor;
        polygonOptions.f354437d = strokeWidth;
        polygonOptions.f354440g = zIndex;
        List<AvitoMapPoint> list = avitoMapPoints;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AvitoMapPoint) it.next()).toLatLng());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            polygonOptions.f354435b.add((LatLng) it2.next());
        }
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            return new GoogleAvitoMapPolygon(new C36825i(c36806c.f354354a.Q(polygonOptions)));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapPolyline addPolyline(@k List<AvitoMapPoint> avitoMapPoints, int outlineColor, float outlineWidth, int strokeColor, boolean withGaps, float strokeWidth, float zIndex, boolean addToMemory) {
        PolylineOptions polylineOptions = new PolylineOptions();
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            j jVar = new j(c36806c.f354354a.Z3(polylineOptions));
            zzz zzzVar = jVar.f354492a;
            try {
                zzzVar.setColor(strokeColor);
                try {
                    zzzVar.setWidth(strokeWidth);
                    try {
                        zzzVar.setZIndex(zIndex);
                        try {
                            zzzVar.setGeodesic(true);
                            return new GoogleAvitoMapPolyline(jVar);
                        } catch (RemoteException e12) {
                            throw new RuntimeRemoteException(e12);
                        }
                    } catch (RemoteException e13) {
                        throw new RuntimeRemoteException(e13);
                    }
                } catch (RemoteException e14) {
                    throw new RuntimeRemoteException(e14);
                }
            } catch (RemoteException e15) {
                throw new RuntimeRemoteException(e15);
            }
        } catch (RemoteException e16) {
            throw new RuntimeRemoteException(e16);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public List<AvitoMapMarker> addSameMarkers(@k List<AvitoMapPoint> avitoMapPoints, @l Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, boolean isVisible) {
        int size = avitoMapPoints.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(addMarker(avitoMapPoints.get(i12), bitmap, anchor, zIndex, isVisible));
        }
        return arrayList;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addUserCoords(@k AvitoMapPoint point, boolean isApproximated, int themeResId) {
        if (isApproximated) {
            return addCircle(point, 3000.0f, 2000.0f, androidx.core.content.d.getColor(this.context, R.color.stroke_black), androidx.core.content.d.getColor(this.context, R.color.fill_black), 1.0f);
        }
        return addMarker(point, AvitoMapMarker.Type.MARKER_MY_LOCATION_RED, AvitoMapMarker.Anchor.CENTER, Float.valueOf(8.0f), themeResId);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void clearDrawing() {
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            c36806c.f354354a.clear();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
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
    @k
    public AvitoMapPoint fromScreenLocation(@k Point point) {
        try {
            return AvitoGoogleMapKt.toAvitoMapPoint(this.map.d().f354364a.T3(new f(point)));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @k
    public final Context getContext() {
        return this.context;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapBounds getMapBounds() {
        return AvitoGoogleMapKt.toAvitoMapBounds(this.map.d().a().f354483f);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapCameraPosition getMapCameraPosition() {
        return new AvitoMapCameraPosition(getMapTarget().getPoint(), getMapTarget().getZoomLevel(), this.map.c().f354377d, null, getMapBounds(), 8, null);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapTarget getMapTarget() {
        CameraPosition cameraPositionC = this.map.c();
        return new AvitoMapTarget(AvitoGoogleMapKt.toAvitoMapPoint(cameraPositionC.f354375b), cameraPositionC.f354376c);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public Q<Integer, Integer> getSize() {
        return new Q<>(Integer.valueOf(this.map.d().b(this.map.d().a().f354480c).x - this.map.d().b(this.map.d().a().f354479b).x), Integer.valueOf(this.map.d().b(this.map.d().a().f354480c).y - this.map.d().b(this.map.d().a().f354482e).y));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapUiSettings getUiSettings() {
        return new GoogleAvitoMapUiSettings(this.map, this.context);
    }

    public final boolean isDarkTheme(@k Resources resources) {
        return (resources.getConfiguration().uiMode & 48) == 32;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveTo(@k AvitoMapPoint avitoMapPoint, boolean animate, @l Float zoomLevel) {
        updateMap(C36805b.b(avitoMapPoint.toLatLng(), zoomLevel != null ? zoomLevel.floatValue() : this.map.c().f354376c), animate);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToBounds(@k AvitoMapBounds bounds, boolean animate, int boundsPadding) {
        C36804a c36804aA = C36805b.a(AvitoGoogleMapKt.toLatLngBounds(bounds), boundsPadding);
        if (animate) {
            this.map.b(c36804aA);
        } else {
            this.map.e(c36804aA);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToCircle(@l AvitoMapPoint centerPoint, float radiusInMeter) {
        Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
        LatLngBounds.a aVar = new LatLngBounds.a();
        double d12 = radiusInMeter;
        aVar.b(com.google.maps.android.f.a(centerPoint != null ? centerPoint.toLatLng() : null, d12, 0.0d));
        aVar.b(com.google.maps.android.f.a(centerPoint != null ? centerPoint.toLatLng() : null, d12, 90.0d));
        aVar.b(com.google.maps.android.f.a(centerPoint != null ? centerPoint.toLatLng() : null, d12, 180.0d));
        aVar.b(com.google.maps.android.f.a(centerPoint != null ? centerPoint.toLatLng() : null, d12, 270.0d));
        this.map.e(C36805b.a(aVar.a(), (int) (d12 * 0.1d)));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToPointsWithPadding(@k List<AvitoMapPoint> points, @l Integer zoomPadding, @l ZoomOffset zoomOffset, boolean animate, @l Integer mapHeight) {
        LatLngBounds.a aVar = new LatLngBounds.a();
        Iterator<T> it = points.iterator();
        while (it.hasNext()) {
            aVar.b(((AvitoMapPoint) it.next()).toLatLng());
        }
        C36804a c36804aA = C36805b.a(aVar.a(), zoomPadding != null ? zoomPadding.intValue() : 0);
        if (animate) {
            this.map.b(c36804aA);
        } else {
            this.map.e(c36804aA);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveToPointsWithPaddingCentered(@k List<AvitoMapPoint> points, @l Integer zoomPadding, boolean animate, @l Integer mapHeight, @l AvitoMapPoint centerPoint) {
        C36804a c36804aA = C36805b.a(AvitoGoogleMapKt.toLatLngBounds(new AvitoFittingBoundsBuilder(points).setCenterPoint(centerPoint).build()), zoomPadding != null ? zoomPadding.intValue() : 0);
        if (animate) {
            this.map.b(c36804aA);
        } else {
            this.map.e(c36804aA);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void removeMarker(@k AvitoMapMarker marker, boolean withAnimation) {
        C36819c circle;
        C36824h marker2;
        GoogleAvitoMapMarker googleAvitoMapMarker = marker instanceof GoogleAvitoMapMarker ? (GoogleAvitoMapMarker) marker : null;
        if (googleAvitoMapMarker != null && (marker2 = googleAvitoMapMarker.getMarker()) != null) {
            try {
                marker2.f354490a.remove();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
        GoogleAvitoMapCircle googleAvitoMapCircle = marker instanceof GoogleAvitoMapCircle ? (GoogleAvitoMapCircle) marker : null;
        if (googleAvitoMapCircle == null || (circle = googleAvitoMapCircle.getCircle()) == null) {
            return;
        }
        try {
            circle.f354486a.remove();
        } catch (RemoteException e13) {
            throw new RuntimeRemoteException(e13);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void removePolygon(@k AvitoMapPolygon polygon) {
        C36825i polygon2;
        GoogleAvitoMapPolygon googleAvitoMapPolygon = polygon instanceof GoogleAvitoMapPolygon ? (GoogleAvitoMapPolygon) polygon : null;
        if (googleAvitoMapPolygon == null || (polygon2 = googleAvitoMapPolygon.getPolygon()) == null) {
            return;
        }
        try {
            polygon2.f354491a.remove();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void removePolyline(@k AvitoMapPolyline polyline) {
        j polyline2;
        GoogleAvitoMapPolyline googleAvitoMapPolyline = polyline instanceof GoogleAvitoMapPolyline ? (GoogleAvitoMapPolyline) polyline : null;
        if (googleAvitoMapPolyline == null || (polyline2 = googleAvitoMapPolyline.getPolyline()) == null) {
            return;
        }
        try {
            polyline2.f354492a.remove();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void restoreTarget(@k AvitoMapTarget target) {
        moveTo(target.getPoint(), false, Float.valueOf(target.getZoomLevel()));
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setMaxZoomPreference(float zoomPreference) {
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            c36806c.f354354a.setMaxZoomPreference(zoomPreference);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setMinZoomPreference(float zoomPreference) {
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            c36806c.f354354a.setMinZoomPreference(zoomPreference);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setPadding(int top, int right, int bottom, int left) {
        C36806c c36806c = this.map;
        c36806c.getClass();
        try {
            c36806c.f354354a.setPadding(top, right, bottom, left);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public Point toScreenLocation(@k AvitoMapPoint latLng) {
        return this.map.d().b(latLng.toLatLng());
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
        C36804a c36804aB = C36805b.b(getMapTarget().getPoint().toLatLng(), zoomLevel);
        if (animate) {
            this.map.b(c36804aB);
        } else {
            this.map.e(c36804aB);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveTo(double latitude, double longitude, boolean animate, @l Float zoomLevel) {
        updateMap(C36805b.b(new LatLng(latitude, longitude), zoomLevel != null ? zoomLevel.floatValue() : this.map.c().f354376c), animate);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void moveTo(@k AvitoMapBounds avitoMapBounds, boolean animate) {
        updateMap(C36805b.a(AvitoGoogleMapKt.toLatLngBounds(avitoMapBounds), 0), animate);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapMarkerOptions options) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.f354419e = C36818b.a(options.getIcon());
        LatLng latLng = options.getPosition().toLatLng();
        if (latLng != null) {
            markerOptions.f354416b = latLng;
            C36824h c36824hA = this.map.a(markerOptions);
            c36824hA.a(options.getAnchor().getX(), options.getAnchor().getY());
            GoogleAvitoMapMarker googleAvitoMapMarker = new GoogleAvitoMapMarker(c36824hA);
            googleAvitoMapMarker.setData(googleAvitoMapMarker);
            return googleAvitoMapMarker;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void onLowMemory() {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void onStart() {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @k AvitoMapMarker.Type type, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, int themeResId) {
        return addMarker(avitoMapPoint, type.getDrawableRes(), anchor, zIndex, themeResId);
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(@k AvitoMapPoint avitoMapPoint, @l Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, @l Float zIndex, boolean isVisible) {
        if (bitmap == null) {
            return AvitoMap.DefaultImpls.addMarker$default(this, avitoMapPoint, AvitoMapMarker.Type.MARKER_PIN_DEFAULT, AvitoMapMarker.Anchor.BOTTOM_CENTER, (Float) null, 0, 8, (Object) null);
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.f354419e = C36818b.a(bitmap);
        markerOptions.f354416b = new LatLng(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude());
        C36824h c36824hA = this.map.a(markerOptions);
        c36824hA.a(anchor.getX(), anchor.getY());
        if (zIndex != null) {
            c36824hA.b(zIndex.floatValue());
        }
        try {
            c36824hA.f354490a.setVisible(isVisible);
            GoogleAvitoMapMarker googleAvitoMapMarker = new GoogleAvitoMapMarker(c36824hA);
            googleAvitoMapMarker.setData(googleAvitoMapMarker);
            return googleAvitoMapMarker;
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void distinctSameMoveEvent(boolean distinct) {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void onStop(boolean clearAll) {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    @k
    public AvitoMapMarker addMarker(double latitude, double longitude, @k Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor anchor, float zIndex, @k String imageId, boolean withAnimation) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.f354419e = C36818b.a(bitmap);
        markerOptions.f354416b = new LatLng(latitude, longitude);
        C36824h c36824hA = this.map.a(markerOptions);
        c36824hA.a(anchor.getX(), anchor.getY());
        c36824hA.b(zIndex);
        GoogleAvitoMapMarker googleAvitoMapMarker = new GoogleAvitoMapMarker(c36824hA);
        googleAvitoMapMarker.setData(googleAvitoMapMarker);
        return googleAvitoMapMarker;
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setLogoAlignment(@k AvitoMapHorizontalAlignment horizontalAlignment, @k AvitoMapVerticalAlignment verticalAlignment) {
    }

    @Override // com.avito.android.avito_map.AvitoMap
    public void setLogoPadding(int verticalPadding, int horizontalPadding) {
    }
}
