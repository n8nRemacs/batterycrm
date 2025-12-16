package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* loaded from: classes.dex */
public final class j8d implements Parcelable {
    public static final Parcelable.Creator<j8d> CREATOR = new wcb(22);
    public final int a;
    public final float b;
    public Object c;

    public j8d(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static j8d a(Parcelable parcelable) {
        j8d j8dVar;
        j8d j8dVar2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        j8dVar2 = new j8d(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        j8dVar = new j8d(1, rating.hasHeart() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        j8dVar = new j8d(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        j8dVar2 = e(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        j8dVar2 = d(rating.getPercentRating());
                        break;
                }
                j8dVar2 = j8dVar;
            }
            j8dVar2.getClass();
            j8dVar2.c = parcelable;
        }
        return j8dVar2;
    }

    public static j8d d(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new j8d(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static j8d e(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
                return null;
            }
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new j8d(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float b() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
