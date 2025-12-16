package com.avito.beduin.v2.avito.component.graphic_element;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GraphicElement.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/graphic_element/GraphicElement;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GraphicElement {

    /* renamed from: b, reason: collision with root package name */
    public static final GraphicElement f334386b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ GraphicElement[] f334387c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f334388d;

    static {
        GraphicElement graphicElement = new GraphicElement("Plus", 0);
        f334386b = graphicElement;
        GraphicElement[] graphicElementArr = {graphicElement, new GraphicElement("Snowflake", 1), new GraphicElement("Diamond", 2), new GraphicElement("Piece", 3), new GraphicElement("Oval", 4), new GraphicElement("Candy", 5), new GraphicElement("Pill", 6)};
        f334387c = graphicElementArr;
        f334388d = kotlin.enums.c.a(graphicElementArr);
    }

    public GraphicElement() {
        throw null;
    }

    public static GraphicElement valueOf(String str) {
        return (GraphicElement) Enum.valueOf(GraphicElement.class, str);
    }

    public static GraphicElement[] values() {
        return (GraphicElement[]) f334387c.clone();
    }
}
