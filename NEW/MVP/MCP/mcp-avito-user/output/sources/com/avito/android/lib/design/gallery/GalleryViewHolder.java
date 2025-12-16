package com.avito.android.lib.design.gallery;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.gallery.c;
import j.U;
import kotlin.Metadata;

/* compiled from: GalleryViewHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/gallery/GalleryViewHolder;", "Lcom/avito/android/lib/design/gallery/c;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Position", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class GalleryViewHolder<T extends c> extends RecyclerView.C {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GalleryViewHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/gallery/GalleryViewHolder$Position;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Position {

        /* renamed from: b, reason: collision with root package name */
        public static final Position f179198b;

        /* renamed from: c, reason: collision with root package name */
        public static final Position f179199c;

        /* renamed from: d, reason: collision with root package name */
        public static final Position f179200d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Position[] f179201e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179202f;

        static {
            Position position = new Position("FIRST", 0);
            f179198b = position;
            Position position2 = new Position("LAST", 1);
            f179199c = position2;
            Position position3 = new Position("BETWEEN", 2);
            f179200d = position3;
            Position[] positionArr = {position, position2, position3};
            f179201e = positionArr;
            f179202f = kotlin.enums.c.a(positionArr);
        }

        public Position() {
            throw null;
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) f179201e.clone();
        }
    }

    public abstract void B80(@k h hVar, @k T t12, @U float f12, @U float f13, boolean z12);
}
