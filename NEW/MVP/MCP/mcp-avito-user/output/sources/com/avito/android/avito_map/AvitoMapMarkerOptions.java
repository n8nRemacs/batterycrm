package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import com.avito.android.avito_map.AvitoMapMarker;
import kotlin.Metadata;

/* compiled from: AvitoMapMarkerOptions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapMarkerOptions;", "", "position", "Lcom/avito/android/avito_map/AvitoMapPoint;", "anchor", "Lcom/avito/android/avito_map/AvitoMapMarker$Anchor;", "(Lcom/avito/android/avito_map/AvitoMapPoint;Lcom/avito/android/avito_map/AvitoMapMarker$Anchor;)V", "getAnchor", "()Lcom/avito/android/avito_map/AvitoMapMarker$Anchor;", "icon", "Landroid/graphics/Bitmap;", "getIcon", "()Landroid/graphics/Bitmap;", "setIcon", "(Landroid/graphics/Bitmap;)V", "getPosition", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "snippet", "", "getSnippet", "()Ljava/lang/String;", "setSnippet", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapMarkerOptions {

    @k
    private final AvitoMapMarker.Anchor anchor;

    @l
    private Bitmap icon;

    @k
    private final AvitoMapPoint position;

    @l
    private String snippet;

    @l
    private String title;

    public AvitoMapMarkerOptions(@k AvitoMapPoint avitoMapPoint, @k AvitoMapMarker.Anchor anchor) {
        this.position = avitoMapPoint;
        this.anchor = anchor;
    }

    @k
    public final AvitoMapMarker.Anchor getAnchor() {
        return this.anchor;
    }

    @l
    public final Bitmap getIcon() {
        return this.icon;
    }

    @k
    public final AvitoMapPoint getPosition() {
        return this.position;
    }

    @l
    public final String getSnippet() {
        return this.snippet;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(@l Bitmap bitmap) {
        this.icon = bitmap;
    }

    public final void setSnippet(@l String str) {
        this.snippet = str;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }
}
